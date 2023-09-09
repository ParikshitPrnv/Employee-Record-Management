package com.microservicedepartment.departmentservice.mapper;

import com.microservicedepartment.departmentservice.dto.DeptDto;
import com.microservicedepartment.departmentservice.entity.DeptJpa;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AutoDeptMapper {
    AutoDeptMapper Mapper = Mappers.getMapper(AutoDeptMapper.class);
    public DeptDto jpaToDto(DeptJpa dept);

    public DeptJpa dtoToJpa(DeptDto dto);
}
