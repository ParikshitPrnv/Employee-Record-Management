package com.microserviceemployee.employeeservice.controller;

import com.microserviceemployee.employeeservice.dto.ApiDto;
import com.microserviceemployee.employeeservice.dto.DeptDto;
import com.microserviceemployee.employeeservice.dto.EmpDto;
import com.microserviceemployee.employeeservice.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@Controller
@RequestMapping("api/emp")
@AllArgsConstructor
public class EmployeeController {


    private EmployeeService empService;


    @PostMapping("create")
    public ResponseEntity<EmpDto> createEmployee(@RequestBody EmpDto empDto){
        EmpDto respEmp = empService.createEmployee(empDto);
        return new ResponseEntity<>(respEmp, HttpStatus.CREATED);
    }

    @GetMapping("get/{id}")
    public ResponseEntity<ApiDto> getEmpById(@PathVariable("id") Long empId){
        ApiDto respApiDto = empService.getEmpById(empId);
        return new ResponseEntity<>(respApiDto, HttpStatus.OK);
    }
//    curl --location 'localhost:8081/api/emp/get/217'


}
