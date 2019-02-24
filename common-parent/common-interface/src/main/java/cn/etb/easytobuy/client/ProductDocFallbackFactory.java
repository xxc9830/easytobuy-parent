package cn.etb.easytobuy.client;

import cn.etb.easytobuy.document.ProductDoc;
import cn.etb.easytobuy.util.AjaxResult;
import cn.etb.easytobuy.util.PageList;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class ProductDocFallbackFactory implements FallbackFactory<ProductDocClient> {
    @Override
    public ProductDocClient create(Throwable throwable) {
        return new ProductDocClient(){
            @Override
            public AjaxResult save(ProductDoc productDoc) {
                return null;
            }

            @Override
            public AjaxResult del(Long id) {
                return null;
            }

            @Override
            public AjaxResult batchSave(List<ProductDoc> productDocs) {
                return null;
            }

            @Override
            public AjaxResult batchDel(List<Long> ids) {
                return null;
            }

            @Override
            public ProductDoc get(Long id) {
                return null;
            }

            @Override
            public PageList<ProductDoc> search(Map<String, Object> params) {
                return null;
            }
        };
    }
}
