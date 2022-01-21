package co.edu.iudigital.app.config;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


/**
 * CONFIGURACIÓN DE SWAGGER
 * @author JuanDa
 *
 */


@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.iudigital.autoscolombia.controladores"))
                .paths(PathSelectors.any())
                
                .build()
                .apiInfo(apiInfo())
                ;
    }
	
	private ApiInfo apiInfo() {
		return new ApiInfo(
				"API HelpMeUID", 
				"API para la App de HelpMeUID", 
				"1.0", 
				"https://iudigital.edu.co", 
				new Contact(
						"Juan David Rendon", 
						"https://iudigital.edu.co", 
						"juandavid@gmail.com"), 
				"Apache 2.0", 
				"https://www.apache.org/licenses/LICENSE-2.0.html",
				Collections.emptyList()
			);
	}
}
