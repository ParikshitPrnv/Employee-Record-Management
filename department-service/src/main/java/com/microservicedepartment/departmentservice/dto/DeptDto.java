package com.microservicedepartment.departmentservice.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DeptDto {
    private Long id;

    @Column(name = "dept_name")
    private String deptName;

    @Column(name = "dept_description")
    private String deptDescription;

    @Column(name = "dept_code")
    private String deptCode;
}
