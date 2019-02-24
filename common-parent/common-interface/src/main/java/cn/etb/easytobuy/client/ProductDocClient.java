package cn.etb.easytobuy.client;

import cn.etb.easytobuy.document.ProductDoc;
import cn.etb.easytobuy.util.AjaxResult;
import cn.etb.easytobuy.util.PageList;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Map;
@FeignClient(value = "EASYTOBUY-COMMON",fallbackFactory = ProductDocFallbackFactory.class)
@RequestMapping("/productDoc")
public interface ProductDocClient {
    //crud
    //保存
    @RequestMapping(value = "/save",method = RequestMethod.POST)
    AjaxResult save(@RequestBody ProductDoc productDoc);

    //删除
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    AjaxResult del(@PathVariable("id") Long id);

    //批量保存
    @RequestMapping(value = "/batchSave",method = RequestMethod.POST)
    AjaxResult batchSave(@RequestBody List<ProductDoc> productDocs);

    //批量删除
    @RequestMapping(value = "/batchDel",method = RequestMethod.DELETE)
    AjaxResult batchDel(@RequestBody List<Long> ids);

    //查一个
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    ProductDoc get(Long id);

    //高级分页查询
    @RequestMapping(value = "/search",method = RequestMethod.GET)
    PageList<ProductDoc> search(@RequestBody Map<String,Object> params);
}
