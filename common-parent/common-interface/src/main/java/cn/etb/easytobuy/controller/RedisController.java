package cn.itsource.aigou.controller;

import cn.itsource.aigou.client.RedisClient;
import cn.itsource.aigou.util.RedisUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Copyright (C), 2018-2028, Chong Qing itsource.cn
 * FileName: RedisController.java
 * introduce：
 *
 * @author solargen
 * @version 1.00
 * @Date 2019/2/17
 */

/**
 *
 *
 * java操作redis
 *  Jedis
 */
@RestController
public class RedisController implements RedisClient{

    /**
     * 从redis中根据key获取value
     * @param key
     * @return
     */
    @RequestMapping(value = "/redis",method = RequestMethod.GET)
    public String get(String key){
        return RedisUtils.INSTANCE.get(key);
    }

    /**
     * 向redis中添加一条数据
     * @param key
     * @param value
     */
    @RequestMapping(value = "/redis",method = RequestMethod.POST)
    public void set(String key,String value){
        RedisUtils.INSTANCE.set(key,value);
    }

}
