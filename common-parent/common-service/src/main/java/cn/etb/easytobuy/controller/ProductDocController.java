package cn.etb.easytobuy.controller;

import cn.etb.easytobuy.client.ProductDocClient;
import cn.etb.easytobuy.document.ProductDoc;
import cn.etb.easytobuy.service.IProductDocService;
import cn.etb.easytobuy.util.AjaxResult;
import cn.etb.easytobuy.util.PageList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/productDoc")
public class ProductDocController implements ProductDocClient {

    @Autowired
    private IProductDocService productDocService;

    //保存
    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public AjaxResult save(@RequestBody ProductDoc productDoc){
        try {
            productDocService.save(productDoc);
            return AjaxResult.me();
        } catch (Exception e) {
            e.printStackTrace();
            return AjaxResult.me().setSuccess(false).setMessage("操作失败！"+e.getMessage());
        }
    }

    //删除
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public AjaxResult del(@PathVariable("id") Long id){
        try {
            productDocService.delete(id);
            return AjaxResult.me();
        } catch (Exception e) {
            e.printStackTrace();
            return AjaxResult.me().setSuccess(false).setMessage("操作失败！"+e.getMessage());
        }
    }

    //批量保存
    @RequestMapping(value = "/batchSave",method = RequestMethod.POST)
    public AjaxResult batchSave(@RequestBody List<ProductDoc> productDocs){
        try {
            productDocService.batchSave(productDocs);
            return AjaxResult.me();
        } catch (Exception e) {
            e.printStackTrace();
            return AjaxResult.me().setSuccess(false).setMessage("操作失败！"+e.getMessage());
        }
    }

    //批量删除
    @RequestMapping(value = "/batchDel",method = RequestMethod.DELETE)
    public AjaxResult batchDel(@RequestBody List<Long> ids){
        try {
            productDocService.batchDelete(ids);
            return AjaxResult.me();
        } catch (Exception e) {
            e.printStackTrace();
            return AjaxResult.me().setSuccess(false).setMessage("操作失败！"+e.getMessage());
        }
    }

    //查一个
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public ProductDoc get(Long id){
        return productDocService.get(id);
    }

    //高级分页查询
    @RequestMapping(value = "/search",method = RequestMethod.GET)
    public PageList<ProductDoc> search(@RequestBody Map<String,Object> params){
        return productDocService.search(params);
    }
}
