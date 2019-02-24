package cn.etb.easytobuy.controller;

import cn.etb.easytobuy.client.PageClient;
import cn.etb.easytobuy.util.VelocityUtils;
import org.springframework.web.bind.annotation.*;


@RestController
public class PageController implements PageClient {
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


        VelocityUtils.staticByTemplate(model,templatePath,staticPagePah);

    }
}
