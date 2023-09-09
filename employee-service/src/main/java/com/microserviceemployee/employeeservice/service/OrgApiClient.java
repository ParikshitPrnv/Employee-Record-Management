package com.microserviceemployee.employeeservice.service;

import com.microserviceemployee.employeeservice.dto.OrgDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(url = "localhost:8082/api/org",  value = "ORG-SERVICE")
public interface OrgApiClient {

    @GetMapping("findByCode")
    public OrgDto findOrgByOrgCode(@RequestParam("orgCode") String orgCode);
}
