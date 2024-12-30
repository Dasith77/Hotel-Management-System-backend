package com.SUNSYSTEM.SUN_TRAVEL_SYSTEM.contract;
import com.SUNSYSTEM.SUN_TRAVEL_SYSTEM.DTO.ContractDTO;
import com.SUNSYSTEM.SUN_TRAVEL_SYSTEM.DTO.ContractDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="api/v1/contract")
@CrossOrigin("http://localhost:4200/")

public class ContractController
{
    private final ContractService contractService;

    @Autowired
    public ContractController(ContractService contractService){
        this.contractService=contractService;
    }

    @GetMapping
    public List<Contract> getContracts(){
        return contractService.getContracts();
    }

    @PostMapping
    public Boolean registerNewContract( @RequestBody ContractDTO contractDTO ){
        System.out.println("-----------------------------------------");
        System.out.println(contractDTO.getStartDate());
        System.out.println("-----------------------------------------");
        return contractService.addNewContract( contractDTO );
    }

}
