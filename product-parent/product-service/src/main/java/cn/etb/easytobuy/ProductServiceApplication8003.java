package cn.etb.easytobuy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableEurekaClient
@EnableSwagger2
@MapperScan("cn.etb.easytobuy.mapper")
@EnableFeignClients(basePackages="cn.etb.easytobuy.client")
public class ProductServiceApplication8003 {
    public static void main(String[] args) {
        SpringApplication.run(ProductServiceApplication8003.class, args);
    }

}
