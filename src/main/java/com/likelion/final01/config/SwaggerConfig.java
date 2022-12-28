package com.likelion.final01.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(getApiInfo())
                .select()
                .apis(RequestHandlerSelectors.any())//현재 RequestMapping으로 할당된 모든 URL 리스트 추출
                //.apis(RequestHandlerSelectors.basePackage("com.likelion.final01.controller"))
                //.paths(PathSelectors.ant("/member/**")) //그 중 /member/**인 URL들만 필터링
                .paths(PathSelectors.any())
                .build();
    }
        private ApiInfo getApiInfo() {
        return new ApiInfoBuilder()
                .title("파이널미션01")
                .description("멋사스네스(MutsaSNS) API")
                .contact(new Contact("dhlee", "https://github.com/dohyunre702", "dohyunre702@gmail.com"))
                .version("1.0")
                .build();
    }
}