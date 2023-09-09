package com.ems.organizationmicroservice.mappers;


import com.ems.organizationmicroservice.dto.OrgDto;
import com.ems.organizationmicroservice.entity.OrgJpa;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AutoOrgMapper {

    AutoOrgMapper Mapper = Mappers.getMapper(AutoOrgMapper.class);

    public OrgDto jpaToDto(OrgJpa orgJpa);

    public OrgJpa dtoToJpa(OrgDto orgDto);

}
