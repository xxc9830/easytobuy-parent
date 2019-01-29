package cn.etb.easytobuy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient//表示为Eureka客户端
public class PlatServiceApplication8001 {
    public static void main(String[] args) {
        SpringApplication.run(PlatServiceApplication8001.class, args);
    }
}
