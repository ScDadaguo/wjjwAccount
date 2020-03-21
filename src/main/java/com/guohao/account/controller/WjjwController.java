package com.guohao.account.controller;

import com.arronlong.httpclientutil.HttpClientUtil;
import com.arronlong.httpclientutil.builder.HCB;
import com.arronlong.httpclientutil.common.HttpConfig;
import com.arronlong.httpclientutil.common.HttpHeader;
import com.arronlong.httpclientutil.common.HttpResult;
import com.arronlong.httpclientutil.common.SSLs.SSLProtocolVersion;
import com.arronlong.httpclientutil.exception.HttpProcessException;
import com.guohao.account.model.Wjjw;
import com.guohao.account.service.WjjwService;
import org.apache.http.Header;
import org.apache.http.client.HttpClient;
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
    private final static String WX_LOGIN_URL="https://api.weixin.qq.com/sns/jscode2session?appid={appId}&secret={secret}&js_code={code}&grant_type=authorization_code'";
    private final static String appId = "wx6266ee9fca6eec27";
    private final static String secret = "320924f0245d209874f583a1f2e1b511";
    @Autowired
    private WjjwService wjjwService;


    @GetMapping("/index")
    public String index() {
        return "index";
    }

    /**
     * 插入  带图片
     *
     * @param wjjw
     * @return
     */
    @RequestMapping(value = "/insertWjjw", method = RequestMethod.POST)
    public Object insertWjjw(Wjjw wjjw) {
        System.out.println(wjjw.toString());
        return wjjwService.insertWjjw(wjjw);
    }


    /**
     * 插入 不带图片
     *
     * @param wjjw
     * @return
     */
    @RequestMapping(value = "/saveWjjw", method = RequestMethod.POST)
    public Object saveWjjw(@RequestBody Wjjw wjjw) {
        System.out.println(wjjw.toString());
        return wjjwService.insertWjjw(wjjw);
    }


    /**
     * 修改账单  有图片
     *
     * @param wjjw
     * @return
     */
    @RequestMapping(value = "/updateWjjw", method = RequestMethod.POST)
    public Object updataWjjw(Wjjw wjjw) {
        return wjjwService.updateWjjw(wjjw);

    }

    /**
     * 修改账单  没图片
     *
     * @param wjjw
     * @return
     */
    @RequestMapping(value = "/updateWithoutImageWjjw", method = RequestMethod.POST)
    public Object updateWithoutImageWjjw(@RequestBody Wjjw wjjw) {
        return wjjwService.updateWjjw(wjjw);
    }


    /**
     * 查询所有账单
     *
     * @return
     */
    @RequestMapping(value = "/listWjjw", method = RequestMethod.GET)
    public Map<String, Object> listWjjw(@RequestParam String openId) {

        List<Wjjw> list = wjjwService.queryWjjw(openId);
        Map<String, Object> map = new HashMap<>();
        map.put("wjjwList", list);
        return map;
    }

    /**
     * 根据账单id查询
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/querywjjwById", method = RequestMethod.GET)
    public Map<String, Object> querywjjwById(Integer id) {
        System.out.println(id);
        Map<String, Object> modelMap = new HashMap<>();
        Wjjw wjjw = wjjwService.queryWjjwById(id);
        modelMap.put("wjjw", wjjw);
        return modelMap;
    }


    /**
     * 删除账单
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/deleteWjjw", method = RequestMethod.GET)
    public Map<String, Object> deleteWjjw(Integer id) {
        Map<String, Object> map = new HashMap<>();
        boolean result = wjjwService.deleteWjjw(id);
        map.put("success", result);
        return map;
    }


    @RequestMapping("/uploadimg")
    public String uploadimg() {
        return "/uploadimg/static/image/guohao.png";
    }


    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public Object login(String code) throws HttpProcessException {
        String loginUrl = WX_LOGIN_URL.replace("{appId}", appId).replace("{secret}", secret).replace("{code}", code);
        System.out.println(loginUrl);

        //插件式配置Header（各种header信息、自定义header）
        Header[] headers 	= HttpHeader.custom()
                .userAgent("javacl")
                .other("customer", "自定义")
                .build();

        //插件式配置生成HttpClient时所需参数（超时、连接池、ssl、重试）
        HCB hcb 				= HCB.custom()
                //.timeout(1000) 		//超时
                .pool(100, 10)    	//启用连接池，每个路由最大创建10个链接，总连接数限制为100个
                .sslpv(SSLProtocolVersion.TLSv1_2) 	//可设置ssl版本号，默认SSLv3，用于ssl，也可以调用sslpv("TLSv1.2")
                .ssl()  			   		//https，支持自定义ssl证书路径和密码，ssl(String keyStorePath, String keyStorepass)
                .retry(5)					//重试5次
                ;

        HttpClient client = hcb.build();

        //插件式配置请求参数（网址、请求参数、编码、client）
        HttpConfig config = HttpConfig.custom()
                .headers(headers)	//设置headers，不需要时则无需设置
                .timeout(1000) 		//超时
                .url(loginUrl)           //设置请求的url
                .encoding("utf-8")  //设置请求和返回编码，默认就是Charset.defaultCharset()
                .client(client)     //如果只是简单使用，无需设置，会自动获取默认的一个client对象
                ;

        String result2 = HttpClientUtil.get(config);   //post请求
        System.out.println(result2);
        return result2;
    }
}
