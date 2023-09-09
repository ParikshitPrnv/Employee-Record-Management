package com.microserviceemployee.employeeservice.mapper;

import com.microserviceemployee.employeeservice.dto.EmpDto;
import com.microserviceemployee.employeeservice.entity.EmpJpa;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AutoEmpMapper {
    AutoEmpMapper Mapper = Mappers.getMapper(AutoEmpMapper.class);

//    @Mapping(source = "orgCode", target = "orgCode")
    public EmpDto jpaToDto(EmpJpa empJpa);

//    @Mapping(source = "orgCode", target = "orgCode")
    public EmpJpa dtoToJpa(EmpDto empDto);
}
