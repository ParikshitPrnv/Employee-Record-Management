package com.microservicedepartment.departmentservice.mapper;

import com.microservicedepartment.departmentservice.dto.DeptDto;
import com.microservicedepartment.departmentservice.entity.DeptJpa;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-09T15:56:57+0530",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 20.0.2 (Oracle Corporation)"
)
public class AutoDeptMapperImpl implements AutoDeptMapper {

    @Override
    public DeptDto jpaToDto(DeptJpa dept) {
        if ( dept == null ) {
            return null;
        }

        DeptDto deptDto = new DeptDto();

        deptDto.setId( dept.getId() );
        deptDto.setDeptName( dept.getDeptName() );
        deptDto.setDeptDescription( dept.getDeptDescription() );
        deptDto.setDeptCode( dept.getDeptCode() );

        return deptDto;
    }

    @Override
    public DeptJpa dtoToJpa(DeptDto dto) {
        if ( dto == null ) {
            return null;
        }

        DeptJpa deptJpa = new DeptJpa();

        if ( dto.getId() != null ) {
            deptJpa.setId( dto.getId() );
        }
        deptJpa.setDeptName( dto.getDeptName() );
        deptJpa.setDeptDescription( dto.getDeptDescription() );
        deptJpa.setDeptCode( dto.getDeptCode() );

        return deptJpa;
    }
}
