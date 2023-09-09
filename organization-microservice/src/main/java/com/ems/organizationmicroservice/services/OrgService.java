package com.ems.organizationmicroservice.services;

import com.ems.organizationmicroservice.dto.OrgDto;
import org.springframework.stereotype.Service;

@Service
public interface OrgService {

    public OrgDto saveOrg(OrgDto orgDto);
    public OrgDto getOrgById(Long id);
    public OrgDto getOrgByCode(String orgCode);

}
