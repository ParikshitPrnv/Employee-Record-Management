package com.microservicedepartment.departmentservice;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import jakarta.persistence.Column;
import org.mapstruct.Mapper;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;



//@OpenAPIDefinition(
//        info = @Info(
//                title = "Dept Service REST APIs",
//                description = "Dept Service Desc",
//                version = "v1.0",
//                contact = @Contact(
//                        name = "Prnv",
//                        email = "sample@email.com",
//                        url = "temp-url.com"
//                ),
//                license = @License(
//                        name = "Springboot license",
//                        url = "license-url.com"
//                )
//        )
//)

@SpringBootApplication
public class DepartmentServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DepartmentServiceApplication.class, args);
    }

}
