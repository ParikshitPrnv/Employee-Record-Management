package com.ems.organizationmicroservice.controllers;

import com.ems.organizationmicroservice.dto.OrgDto;
import com.ems.organizationmicroservice.services.OrgService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@AllArgsConstructor
@RequestMapping("api/org")
public class OrgController {
    OrgService orgService;

    @PostMapping("create")
    public ResponseEntity<OrgDto> saveOrg(@RequestBody OrgDto orgDto){
        OrgDto savedOrg = orgService.saveOrg(orgDto);
        return new ResponseEntity<>(savedOrg, HttpStatus.CREATED);
    }

    @GetMapping("findById/{id}")
    public ResponseEntity<OrgDto> findOrgById(@PathVariable("id") Long orgId){
        OrgDto orgDto = orgService.getOrgById(orgId);
        return new ResponseEntity<>(orgDto, HttpStatus.OK);
    }

    @GetMapping("findByCode")
    public ResponseEntity<OrgDto> findOrgByOrgCode(@RequestParam("orgCode") String orgCode){
        OrgDto orgDto = orgService.getOrgByCode(orgCode);
        return new ResponseEntity<>(orgDto, HttpStatus.OK);
    }

}
