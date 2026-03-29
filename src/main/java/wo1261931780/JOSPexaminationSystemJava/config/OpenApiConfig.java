package wo1261931780.JOSPexaminationSystemJava.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * OpenAPI 3配置类
 * 用于Knife4j 4.x版本
 * 
 * @author junw
 * @since 2026-03-29
 */
@Configuration
public class OpenApiConfig {
    
    /**
     * 配置OpenAPI基本信息
     * 用于Knife4j生成API文档
     * 
     * @return OpenAPI配置对象
     */
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("研究生考试分数查询系统API")
                        .version("1.0.0")
                        .description("研究生考试分数查询系统接口文档")
                        .contact(new Contact()
                                .name("wo1261931780")
                                .url("https://github.com/wo1261931780")));
    }
}
