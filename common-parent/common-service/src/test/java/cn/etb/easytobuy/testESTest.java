package cn.etb.easytobuy;

import cn.etb.easytobuy.document.ProductDoc;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = CommonServiceApplication8010.class)
public class testESTest {


    @Autowired
    private ElasticsearchTemplate elasticsearchTemplate;
    @Test
    public void testES() {
        //先删除索引库
        elasticsearchTemplate.deleteIndex(ProductDoc.class);
        //再刺激
        elasticsearchTemplate.createIndex(ProductDoc.class);

        elasticsearchTemplate.putMapping(ProductDoc.class);
    }
}
