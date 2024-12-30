package com.SUNSYSTEM.SUN_TRAVEL_SYSTEM.view;

import com.SUNSYSTEM.SUN_TRAVEL_SYSTEM.DTO.ContractViewDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="api/v1/viewContract")
@CrossOrigin("http://localhost:4200")

public class ViewController
{
    private final ViewService viewService;

    @Autowired
    public  ViewController(ViewService viewService){
        this.viewService=viewService;
    }

    @GetMapping
    public List<ContractViewDTO> getAllcontractDetails(  ){
        System.out.println("came here..");
        return viewService.getAllcontractDetails();
    }


}
