package cn.etb.easytobuy.service;



import cn.etb.easytobuy.document.ProductDoc;
import cn.etb.easytobuy.util.PageList;

import java.util.List;
import java.util.Map;

public interface IProductDocService {
    /**
     * 保存
     * @param productDoc
     */
    void save(ProductDoc productDoc);

    /**
     * 删除
     * @param id
     */
    void delete(Long id);

    /**
     * 批量保存
     * @param productDocs
     */
    void batchSave(List<ProductDoc> productDocs);

    /**
     * 批量删除
     * @param ids
     */
    void batchDelete(List<Long> ids);

    /**
     * 根据id查一个
     * @param id
     * @return
     */
    ProductDoc get(Long id);

    /**
     * 高级分页查询
     * @param params
     * @return
     */
    PageList<ProductDoc> search(Map<String, Object> params);
}
