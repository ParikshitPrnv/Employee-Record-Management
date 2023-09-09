package com.microserviceemployee.employeeservice.service;

import com.microserviceemployee.employeeservice.dto.ApiDto;
import com.microserviceemployee.employeeservice.dto.DeptDto;
import com.microserviceemployee.employeeservice.dto.EmpDto;
import com.microserviceemployee.employeeservice.dto.OrgDto;
import com.microserviceemployee.employeeservice.entity.EmpJpa;
import com.microserviceemployee.employeeservice.mapper.EmpMapper;
import com.microserviceemployee.employeeservice.repository.EmpRepository;
import io.github.resilience4j.retry.annotation.Retry;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService{
    private EmpRepository empRepository;
private EmpMapper empMapper;
private DeptApiIClient deptApiIClient;
private OrgApiClient orgApiClient;
private WebClient webClient;
//    private RestTemplate restTemplate;

private static final Logger logger = LoggerFactory.getLogger(EmployeeServiceImpl.class);

    @Override
    public EmpDto createEmployee(EmpDto empDto) {
        logger.info("inside_create_emp, orgCode: " + empDto.getOrgCode());
        EmpJpa empJpa = empMapper.dtoToJpa(empDto);

//        empJpa.setOrgCode(empDto.getOrgCode());
        logger.info("saved jpa: " + empJpa.getOrgCode());
        EmpJpa respEmpJpa = empRepository.save(empJpa);
        logger.info("respEmpJpa jpa: " + respEmpJpa.getOrgCode());
        EmpDto empDto1 =  empMapper.jpaToDto(respEmpJpa);
//        empDto1.setOrgCode(respEmpJpa.getOrgCode());
        return empDto1;
    }

//    @Retry(name= "${spring.application.name}", fallbackMethod = "retryGetDeptReq")
//    @CircuitBreaker(name = "${spring.application.name}", fallbackMethod = "getDefaultDept")
    @Override
    public ApiDto getEmpById(Long empId) {
        logger.info("inside_getEmpById");
        EmpJpa empJpa = empRepository.getReferenceById(empId);
        logger.info("empJpa_getDeptCode(): "  + empJpa.getDeptCode());
        DeptDto deptDto = deptApiIClient.getDeptByCode(empJpa.getDeptCode());
        logger.info("deptDto_loaded: " + deptDto.getDeptCode());
        OrgDto orgDto = orgApiClient.findOrgByOrgCode(empJpa.getOrgCode());
        logger.info("orgDto_loaded: " + orgDto.getOrgCode());

//        String url = "http://localhost:8080/api/dept/find?deptCode=";
//        url = url.concat(empJpa.getDeptCode());
//        ResponseEntity<DeptDto> respDeptDto = restTemplate.getForEntity(url, DeptDto.class);
//        DeptDto deptDto = webClient.get()
//                .uri(url)
//                .retrieve()
//                .bodyToMono(DeptDto.class)
//                .block();
//       ApiDto apiDto = new ApiDto(respDeptDto.getBody(), empMapper.jpaToDto(empJpa));
        ApiDto apiDto = new ApiDto(deptDto, empMapper.jpaToDto(empJpa), orgDto);
        return apiDto;
    }

    public ApiDto getDefaultDept(Long empId, Exception exception) {
        EmpJpa empJpa = empRepository.getReferenceById(empId);
        DeptDto deptDto = new DeptDto();
        OrgDto orgDto = new OrgDto();
        return new ApiDto(deptDto, empMapper.jpaToDto(empJpa), orgDto);
    }

    public ApiDto retryGetDeptReq(Long empId, Exception exception) {

        logger.info("inside retryGetDeptReq");
        EmpJpa empJpa = empRepository.getReferenceById(empId);
        DeptDto deptDto = new DeptDto();
        OrgDto orgDto = new OrgDto();
        return new ApiDto(deptDto, empMapper.jpaToDto(empJpa), orgDto);
    }

}














