package cn.etb.easytobuy.service.impl;

import cn.etb.easytobuy.document.ProductDoc;
import cn.etb.easytobuy.repository.ProductDocRepository;
import cn.etb.easytobuy.service.IProductDocService;
import cn.etb.easytobuy.util.PageList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service
public class ProductDocImpl implements IProductDocService {

    @Autowired
    private ProductDocRepository productDocRepository;


    @Override
    public void save(ProductDoc productDoc) {
        productDocRepository.save(productDoc);
    }

    @Override
    public void delete(Long id) {
        productDocRepository.deleteById(id);
    }

    @Override
    public void batchSave(List<ProductDoc> productDocs) {
        productDocRepository.saveAll(productDocs);
    }

    @Override
    public void batchDelete(List<Long> ids) {
        for (Long id : ids) {
            productDocRepository.deleteById(id);
        }
    }

    @Override
    public ProductDoc get(Long id) {
        return productDocRepository.findById(id).get();
    }

    @Override
    public PageList<ProductDoc> search(Map<String, Object> params) {
        return null;
    }
}
