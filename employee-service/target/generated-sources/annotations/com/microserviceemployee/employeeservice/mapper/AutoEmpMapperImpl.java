package com.microserviceemployee.employeeservice.mapper;

import com.microserviceemployee.employeeservice.dto.EmpDto;
import com.microserviceemployee.employeeservice.entity.EmpJpa;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-10-11T00:37:46+0530",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.35.0.v20230814-2020, environment: Java 17.0.8.1 (Eclipse Adoptium)"
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
