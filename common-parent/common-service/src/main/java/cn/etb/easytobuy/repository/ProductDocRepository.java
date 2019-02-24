package cn.etb.easytobuy.repository;

import cn.etb.easytobuy.document.ProductDoc;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductDocRepository extends ElasticsearchRepository<ProductDoc,Long> {
}
