package com.guohao.account.controller;

import com.guohao.account.model.Wjjw;
import com.guohao.account.service.WjjwService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping
public class WjjwController {

    private static final Logger log = LoggerFactory.getLogger(WjjwController.class);

    @Autowired
    private WjjwService wjjwService;



    @GetMapping("/index")
    public String index() {
        return "index";
    }

    /**
     * 插入  带图片
     * @param wjjw
     * @return
     */
    @RequestMapping(value="/insertWjjw",method = RequestMethod.POST)
    public Object insertWjjw( Wjjw wjjw){
        System.out.println(wjjw.toString());
        return wjjwService.insertWjjw(wjjw);
    }


    /**
     * 插入 不带图片
     * @param wjjw
     * @return
     */
    @RequestMapping(value="/saveWjjw",method = RequestMethod.POST)
    public Object saveWjjw(@RequestBody Wjjw wjjw){
        System.out.println(wjjw.toString());
        return wjjwService.insertWjjw(wjjw);
    }


    /**
     * 修改账单  有图片
     * @param wjjw
     * @return
     */
    @RequestMapping(value="/updateWjjw",method = RequestMethod.POST)
    public Object updataWjjw( Wjjw wjjw){
        return wjjwService.updateWjjw(wjjw);

    }

    /**
     * 修改账单  没图片
     * @param wjjw
     * @return
     */
    @RequestMapping(value="/updateWithoutImageWjjw",method = RequestMethod.POST)
    public Object updateWithoutImageWjjw(@RequestBody Wjjw wjjw){
        return wjjwService.updateWjjw(wjjw);
    }


    /**
     * 查询所有账单
     * @return
     */
    @RequestMapping(value = "/listWjjw",method =RequestMethod.GET)
    public Map<String,Object> listWjjw(@RequestParam String openId) {

        List<Wjjw> list=wjjwService.queryWjjw(openId);
        Map<String, Object> map = new HashMap<>();
        map.put("wjjwList", list);
        return map;
    }

    /**
     * 根据账单id查询
     * @param id
     * @return
     */
    @RequestMapping(value="/querywjjwById",method = RequestMethod.GET)
    public Map<String,Object> querywjjwById( Integer id){
        System.out.println(id);
        Map<String,Object> modelMap = new HashMap<>();
        Wjjw wjjw = wjjwService.queryWjjwById(id);
        modelMap.put("wjjw",wjjw);
        return modelMap;
    }



    /**
     * 删除账单
     * @param id
     * @return
     */
    @RequestMapping(value="/deleteWjjw",method = RequestMethod.GET)
    public Map<String,Object> deleteWjjw( Integer id) {
        Map<String, Object> map = new HashMap<>();
        boolean result=wjjwService.deleteWjjw(id);
        map.put("success", result);
        return map;
    }


    @RequestMapping("/uploadimg")
    public String uploadimg()  {
        return "/uploadimg/static/image/guohao.png";
    }




}
