package cn.itsource.aigou.controller;

import cn.itsource.aigou.client.PageClient;
import cn.itsource.aigou.util.VelocityUtils;
import org.springframework.web.bind.annotation.*;

/**
 * Copyright (C), 2018-2028, Chong Qing itsource.cn
 * FileName: PageController.java
 * introduce：
 *
 * @author solargen
 * @version 1.00
 * @Date 2019/2/17
 */
@RestController
public class PageController implements PageClient{
    /**
     * 调用这个接口可以
     *  根据接口的数据，按照指定的模板，将页面生成到指定的位置
     * @param model 数据
     * @param templatePath 模板的路径
     * @param staticPagePah 生成的静态资源的路径
     */
    @RequestMapping(value = "/staticPage",method = RequestMethod.POST)
    public void genStaticPage(@RequestBody Object model,
                              @RequestParam("templatePath") String templatePath,
                              @RequestParam("staticPagePah") String staticPagePah){

        //如果我能接受到这个三个参数，里面就好办了
//        System.out.println(model);
//        System.out.println(templatePath);
//        System.out.println(staticPagePah);
        VelocityUtils.staticByTemplate(model,templatePath,staticPagePah);

    }
}
