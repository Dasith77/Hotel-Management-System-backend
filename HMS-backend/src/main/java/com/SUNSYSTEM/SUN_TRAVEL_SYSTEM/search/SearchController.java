package com.SUNSYSTEM.SUN_TRAVEL_SYSTEM.search;
import com.SUNSYSTEM.SUN_TRAVEL_SYSTEM.DTO.SearchDTO;
import com.SUNSYSTEM.SUN_TRAVEL_SYSTEM.DTO.SearchResultsDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/search")
@CrossOrigin("http://localhost:4200/")

public class SearchController
{

    private final SearchService searchService;

    @Autowired
    public SearchController( SearchService searchService )
    {
        this.searchService=searchService;
    }

    @PostMapping
    public List<SearchResultsDTO> getAvailableRooms( @RequestBody SearchDTO searchDTO ){
        //System.out.println("num of nights..."+searchDTO.getNumOfNights());

        return searchService.getAvailableRooms( searchDTO );

    }

}
