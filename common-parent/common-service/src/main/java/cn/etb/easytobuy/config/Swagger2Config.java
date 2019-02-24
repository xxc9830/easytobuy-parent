package cn.etb.easytobuy.config;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * Copyright (C), 2018-2028, Chong Qing itsource.cn
 * FileName: Swagger2Config.java
 * introduce：
 *
 * @author solargen
 * @version 1.00
 * @Date 2019/2/15
 */
@SpringBootConfiguration
public class Swagger2Config {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("cn.etb.easytobuy.controller"))
                .paths(PathSelectors.any())
                .build();
    }


    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("公共服务api")
                .description("公共服务接口文档说明")
                .contact(new Contact("xxc", "", "1258345660@qq.com"))
                .version("1.0")
                .build();
    }

}
