package com.microserviceemployee.employeeservice.service;

import com.microserviceemployee.employeeservice.dto.ApiDto;
import com.microserviceemployee.employeeservice.dto.EmpDto;


public interface EmployeeService {
    EmpDto createEmployee(EmpDto empDto);

    ApiDto getEmpById(Long empId);
}
