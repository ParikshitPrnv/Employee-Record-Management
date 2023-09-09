package com.ems.organizationmicroservice.mappers;

import com.ems.organizationmicroservice.dto.OrgDto;
import com.ems.organizationmicroservice.entity.OrgJpa;
import org.springframework.stereotype.Service;

@Service
public class OrgMapper implements AutoOrgMapper {

    @Override
    public OrgDto jpaToDto(OrgJpa orgJpa) {
        return Mapper.jpaToDto(orgJpa);
    }

    @Override
    public OrgJpa dtoToJpa(OrgDto orgDto) {
        return Mapper.dtoToJpa(orgDto);
    }

}
