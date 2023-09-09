package com.microserviceemployee.employeeservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ApiDto {
    private DeptDto deptDto;
    private EmpDto empDto;
    private OrgDto orgDto;
}
