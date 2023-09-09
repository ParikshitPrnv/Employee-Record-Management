package com.microservicedepartment.departmentservice.repository;

import com.microservicedepartment.departmentservice.entity.DeptJpa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeptJpaRepository extends JpaRepository<DeptJpa, Long> {

    DeptJpa findByDeptCode(String deptCode);
}
