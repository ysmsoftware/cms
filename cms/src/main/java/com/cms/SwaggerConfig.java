package com.cms;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;


@Configuration
@EnableSwagger2
@EnableTransactionManagement
public class SwaggerConfig {

	
//hello
	@Bean
	public Docket SwaggerApi() {  
		  
		
		  return new Docket(DocumentationType.SWAGGER_2)        
				  	.select()  
				  	//.apis(RequestHandlerSelectors.basePackage("com.springrestapi.springrestapi"))
				  	.apis(RequestHandlerSelectors.any()) 
				  	.paths(PathSelectors.any()) 
				  	.build();
				  	//.pathMapping("");
		 
	  
			}
	
	
	
	
	

}
