package com.microserviceemployee.employeeservice.mapper;

import com.microserviceemployee.employeeservice.dto.EmpDto;
import com.microserviceemployee.employeeservice.entity.EmpJpa;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-05T22:48:31+0530",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.35.0.v20230721-1147, environment: Java 17.0.7 (Eclipse Adoptium)"
)
public class AutoEmpMapperImpl implements AutoEmpMapper {

    @Override
    public EmpDto jpaToDto(EmpJpa empJpa) {
        if ( empJpa == null ) {
            return null;
        }

        EmpDto empDto = new EmpDto();

        empDto.setDeptCode( empJpa.getDeptCode() );
        empDto.setEmail( empJpa.getEmail() );
        empDto.setFirstName( empJpa.getFirstName() );
        empDto.setId( empJpa.getId() );
        empDto.setLastName( empJpa.getLastName() );
        empDto.setOrgCode( empJpa.getOrgCode() );

        return empDto;
    }

    @Override
    public EmpJpa dtoToJpa(EmpDto empDto) {
        if ( empDto == null ) {
            return null;
        }

        EmpJpa empJpa = new EmpJpa();

        empJpa.setDeptCode( empDto.getDeptCode() );
        empJpa.setEmail( empDto.getEmail() );
        empJpa.setFirstName( empDto.getFirstName() );
        empJpa.setId( empDto.getId() );
        empJpa.setLastName( empDto.getLastName() );
        empJpa.setOrgCode( empDto.getOrgCode() );

        return empJpa;
    }
}
