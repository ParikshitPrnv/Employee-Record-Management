package com.ems.organizationmicroservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrgDto {
    private Long id;
    private String orgName;
    private String orgIndustry;
    private String orgCode;
}
