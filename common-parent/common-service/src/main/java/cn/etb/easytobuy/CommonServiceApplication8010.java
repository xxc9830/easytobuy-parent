package cn.etb.easytobuy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
@EnableEurekaClient
@EnableSwagger2
public class CommonServiceApplication8010 {

    public static void main(String[] args) {
        SpringApplication.run(CommonServiceApplication8010.class,args);
    }
}
