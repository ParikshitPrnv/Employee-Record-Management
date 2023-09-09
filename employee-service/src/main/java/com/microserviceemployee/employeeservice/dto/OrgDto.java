package com.microserviceemployee.employeeservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrgDto {
    private Long orgId;

    private String orgName;
    private String orgIndustry;
    private String orgCode;
}

