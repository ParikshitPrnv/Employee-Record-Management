package com.microserviceemployee.employeeservice.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmpDto {
    private Long id;

    private String firstName;

    private String lastName;

//    @Column(unique = true, nullable = false)
    private String email;

//    @Column(name = "dept_code")
    private String deptCode;

    private String orgCode;
}
