package com.microservicedepartment.departmentservice.service;

import com.microservicedepartment.departmentservice.dto.DeptDto;

public interface DeptService {
    public DeptDto saveDept(DeptDto deptDto);

    public DeptDto getDeptByDeptCode(String deptCode);
}
