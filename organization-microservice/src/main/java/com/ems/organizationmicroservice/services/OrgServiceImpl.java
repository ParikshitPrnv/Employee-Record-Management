package com.ems.organizationmicroservice.services;

import com.ems.organizationmicroservice.dto.OrgDto;
import com.ems.organizationmicroservice.entity.OrgJpa;
import com.ems.organizationmicroservice.mappers.OrgMapper;
import com.ems.organizationmicroservice.repositories.OrgJpaRepository;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class OrgServiceImpl implements OrgService{

    private OrgMapper orgMapper;
    static final Logger logger = LoggerFactory.getLogger(OrgServiceImpl.class);
    private OrgJpaRepository orgJpaRepository;

    @Override
    public OrgDto saveOrg(OrgDto orgDto) {
        logger.info("entered saveOrg");
        OrgJpa orgJpa = orgMapper.dtoToJpa(orgDto);
        logger.info("found org" + orgJpa.toString());
        orgJpa = orgJpaRepository.save(orgJpa);
        logger.info("saved repo");
        return orgMapper.jpaToDto(orgJpa);
    }

    @Override
    public OrgDto getOrgById(Long orgId) {
        OrgJpa orgJpa = orgJpaRepository.getReferenceById(orgId);
        return orgMapper.jpaToDto(orgJpa);
    }

    @Override
    public OrgDto getOrgByCode(String orgCode) {
        OrgJpa orgJpa = orgJpaRepository.getOrgJpaByOrgCode(orgCode);
        OrgDto orgDto = new OrgDto(orgJpa.getId(), orgJpa.getOrgName(), orgJpa.getOrgCode(), orgJpa.getOrgIndustry());
        return orgDto;
    }
}
