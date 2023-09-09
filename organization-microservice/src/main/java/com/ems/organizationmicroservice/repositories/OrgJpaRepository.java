package com.ems.organizationmicroservice.repositories;

import com.ems.organizationmicroservice.entity.OrgJpa;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrgJpaRepository extends JpaRepository<OrgJpa, Long> {
    public OrgJpa getOrgJpaByOrgCode(String orgCode);
}
