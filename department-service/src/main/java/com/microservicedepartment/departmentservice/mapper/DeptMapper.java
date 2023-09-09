package com.microservicedepartment.departmentservice.mapper;

import com.microservicedepartment.departmentservice.dto.DeptDto;
import com.microservicedepartment.departmentservice.entity.DeptJpa;
import org.springframework.stereotype.Service;

@Service
public class DeptMapper implements AutoDeptMapper{


    @Override
    public DeptDto jpaToDto(DeptJpa deptJpa) {
        return Mapper.jpaToDto(deptJpa);
    }

    @Override
    public DeptJpa dtoToJpa(DeptDto deptDto) {
        return Mapper.dtoToJpa(deptDto);
    }
}
