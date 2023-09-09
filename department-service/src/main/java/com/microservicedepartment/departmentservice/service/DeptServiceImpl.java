package com.microservicedepartment.departmentservice.service;

import com.microservicedepartment.departmentservice.dto.DeptDto;
import com.microservicedepartment.departmentservice.entity.DeptJpa;
import com.microservicedepartment.departmentservice.mapper.AutoDeptMapper;
import com.microservicedepartment.departmentservice.mapper.DeptMapper;
import com.microservicedepartment.departmentservice.repository.DeptJpaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DeptServiceImpl implements  DeptService{
    private DeptJpaRepository deptJpaRepository;

    @Override
    public DeptDto saveDept(DeptDto deptDto) {
        DeptJpa deptJpa = AutoDeptMapper.Mapper.dtoToJpa(deptDto);
        DeptJpa saveDeptResp = deptJpaRepository.save(deptJpa);
        return AutoDeptMapper.Mapper.jpaToDto(saveDeptResp);
    }

    @Override
    public DeptDto getDeptByDeptCode(String deptCode) {
        DeptJpa deptJpa = deptJpaRepository.findByDeptCode(deptCode);
        return AutoDeptMapper.Mapper.jpaToDto(deptJpa);
    }
}


