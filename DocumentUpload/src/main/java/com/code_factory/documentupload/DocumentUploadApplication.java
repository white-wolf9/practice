package com.code_factory.documentupload;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.code_factory")
@EntityScan("com.code_factory")
public class DocumentUploadApplication {

	public static void main(String[] args) {
		SpringApplication.run(DocumentUploadApplication.class, args);
	}

}
