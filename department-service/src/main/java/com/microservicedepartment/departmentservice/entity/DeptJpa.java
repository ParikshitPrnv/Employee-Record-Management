package com.microservicedepartment.departmentservice.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="depts")
public class DeptJpa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(unique = true, nullable = false)
    private String deptName;

    private String deptDescription;

    @Column(unique = true, nullable = false)
    private String deptCode;
}
