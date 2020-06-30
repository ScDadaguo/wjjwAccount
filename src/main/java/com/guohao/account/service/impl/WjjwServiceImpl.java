package com.guohao.account.service.impl;

import com.guohao.account.constant.Constant;
import com.guohao.account.mapper.WjjwMapper;
import com.guohao.account.model.Wjjw;
import com.guohao.account.service.WjjwService;
import com.guohao.account.utils.ResultUtil;
import org.apache.commons.io.FilenameUtils;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class WjjwServiceImpl implements WjjwService {

    @Autowired
    private WjjwMapper wjjwMapper;
    private final char SEPARATOR = File.separatorChar;
    private final String FORMAT = "yyyy-MM-dd";

    @Value("${report.inputPath}")
    private String inputPath;

    @Value("${file.accessPath}")
    private String accessFilePath;


    /**
     * 1、将文件写入本地 2、保存数据库记录
     *
     * @param wjjw
     */
    @Override
    public Object insertWjjw(Wjjw wjjw) {
        wjjw.setUpdated_at(LocalDateTime.now());
        wjjw.setCreated_at(LocalDateTime.now());
        if (wjjw.getFile() != null) {
            MultipartFile file = wjjw.getFile();
            String localPath = getLocalPath(file);
            boolean translateFileToLocal = translateFileToLocal(localPath, file);
            if (!translateFileToLocal) {
                return ResultUtil.getFailedResult("把文件写入到磁盘时出错");
            }
            localPath = localPath.replace(inputPath, accessFilePath);
            System.out.println(localPath);
            wjjw.setLocalPath(localPath.toString());
            wjjw.setFileName(file.getOriginalFilename());
        }

        System.out.println(wjjw.toString());

        int result= 0;
        try {
            result = wjjwMapper.insertWjjw(wjjw);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (result > 0) {
            return ResultUtil.getSuccessResult(wjjw);
        } else {
            return ResultUtil.getFailedResult("账单上传失败");
        }

    }



    @Override
    public Object updateWjjw(Wjjw wjjw) {
        wjjw.setOpenId(Constant.OPEN_ID);
        wjjw.setUpdated_at(LocalDateTime.now());
        if (wjjw.getFile() != null) {
            MultipartFile file = wjjw.getFile();
            String localPath = getLocalPath(file);
            boolean translateFileToLocal = translateFileToLocal(localPath, file);
            if (!translateFileToLocal) {
                return ResultUtil.getFailedResult("把文件写入到磁盘时出错");
            }
            localPath = localPath.replace(inputPath, accessFilePath);
            wjjw.setLocalPath(localPath.toString());
            wjjw.setFileName(file.getOriginalFilename());
        }

        System.out.println(wjjw.toString());

        int result= 0;
        try {
            result = wjjwMapper.updateWjjw(wjjw);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (result > 0) {
            return ResultUtil.getSuccessResult(wjjw);
        } else {
            return ResultUtil.getFailedResult("账单上传失败");
        }
    }

    @Override
    public List<Wjjw> queryWjjw(String openId) {
        return wjjwMapper.queryWjjw(openId);
    }

    @Override
    public boolean deleteWjjw(Integer id) {
        try {
            int row = wjjwMapper.deleteWjjw(id);
            if(row>0){
                return true;
            }else {
                throw new RuntimeException("删除账单失败！");
            }
        }catch (Exception e){
            throw new RuntimeException("删除账单失败："+e.getMessage());
        }
    }

    @Override
    public Wjjw queryWjjwById(Integer id) {
        return wjjwMapper.queryWjjwById(id);
    }



    /**
     * 创建文件存储的那个父文件夹，能把文件放进去
     *
     * @param localPath
     * @param file
     * @return
     */
    private boolean translateFileToLocal(String localPath, MultipartFile file) {
        File folderFile = new File(localPath);
        File fileParent = folderFile.getParentFile();
        if (!fileParent.exists()) {
            fileParent.mkdirs();
        }
        try {
            file.transferTo(new File(localPath));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return true;
    }

    /**
     * 生成随机的文件存放位置，根据日期来放的
     *
     * @param file
     * @return
     */
    private String getLocalPath(MultipartFile file) {
        StringBuffer localPath = new StringBuffer();
        String time = DateTime.now().toString(FORMAT);
        localPath.append(inputPath).append(SEPARATOR).append(time).append(SEPARATOR)
                .append(UUID.randomUUID().toString()).append(SEPARATOR).append(getFileNameWithoutSuffix(file));
        return localPath.toString();

    }

    /**
     * 文件名前缀md5加密，文件后缀不变，并组合
     *
     * @param file
     * @return
     */
    private String getFileNameWithoutSuffix(MultipartFile file) {
        String organFileName = file.getOriginalFilename();
        String baseName = FilenameUtils.getBaseName(organFileName);
        String ext = FilenameUtils.getExtension(organFileName);
        return baseName+"."+ext;
    }

    public static void main(String[] args) {
        Set<String> strings = new HashSet<>();
        strings.add("1");
        strings.add("2");
        strings.add("3");
        List<Long> longs=strings.stream().map(Long::valueOf).collect(Collectors.toList());
        System.out.println(longs);
    }



}
