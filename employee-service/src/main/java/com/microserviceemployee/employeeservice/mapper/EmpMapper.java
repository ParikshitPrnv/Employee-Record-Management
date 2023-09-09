package com.microserviceemployee.employeeservice.mapper;

import com.microserviceemployee.employeeservice.dto.EmpDto;
import com.microserviceemployee.employeeservice.entity.EmpJpa;
import org.springframework.stereotype.Service;

@Service
public class EmpMapper implements AutoEmpMapper{

    @Override
    public EmpDto jpaToDto(EmpJpa empJpa){
        return Mapper.jpaToDto(empJpa);
    }

    @Override
    public EmpJpa dtoToJpa(EmpDto empDto){
        return Mapper.dtoToJpa(empDto);
    }
}
