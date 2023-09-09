package com.microservicedepartment.departmentservice.controller;

import com.microservicedepartment.departmentservice.dto.DeptDto;
import com.microservicedepartment.departmentservice.service.DeptService;
import com.microservicedepartment.departmentservice.service.DeptServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("api/dept")
public class DeptController {

    DeptService deptService;
    @PostMapping("create")
    public ResponseEntity<DeptDto> createDept(@RequestBody DeptDto deptDto){
       DeptDto respObj =  deptService.saveDept(deptDto);
       return new ResponseEntity<>(respObj, HttpStatus.CREATED);
    }

    @GetMapping("find")
    public ResponseEntity<DeptDto> getDeptByCode(@RequestParam("deptCode") String deptCode){
        DeptDto resObj = deptService.getDeptByDeptCode(deptCode);
        return new ResponseEntity<>(resObj, HttpStatus.OK);
    }

}
