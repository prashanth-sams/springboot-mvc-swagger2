package com.wmock.info;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.Tag;


@Configuration
@EnableSwagger2
public class SwaggerConfig {

    public static final String TAG_1 = "chapter-info";

    @Bean
    public Docket postsApi() {
        return new Docket(DocumentationType.SWAGGER_2).groupName("public-api")
                .apiInfo(apiInfo())
                .select()
                .paths(PathSelectors.any())
                .build()
                .tags(new Tag(TAG_1, "Chapter Info Tag"));
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Chapter Info Service API Doc")
                .description("OAS 2.0 documentation")
                .version("1.0")
                .build();
    }
}
