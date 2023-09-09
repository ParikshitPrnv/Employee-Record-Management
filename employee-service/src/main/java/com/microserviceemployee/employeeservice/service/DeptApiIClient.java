package com.microserviceemployee.employeeservice.service;

import com.microserviceemployee.employeeservice.dto.DeptDto;
import com.microserviceemployee.employeeservice.dto.OrgDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "DEPT-SERVICE")
public interface DeptApiIClient {

    @GetMapping("api/dept/find")
    DeptDto getDeptByCode(@RequestParam("deptCode") String deptCode);


}
