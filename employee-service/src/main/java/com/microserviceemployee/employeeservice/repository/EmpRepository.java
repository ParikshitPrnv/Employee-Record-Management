package com.microserviceemployee.employeeservice.repository;

import com.microserviceemployee.employeeservice.entity.EmpJpa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpRepository extends JpaRepository<EmpJpa, Long> {
}

