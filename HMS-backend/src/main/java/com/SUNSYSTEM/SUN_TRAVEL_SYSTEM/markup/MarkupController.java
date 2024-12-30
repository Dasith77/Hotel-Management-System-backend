package com.SUNSYSTEM.SUN_TRAVEL_SYSTEM.markup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="api/v1/markup")
public class MarkupController
{
    private final MarkupService markupService;

    @Autowired
    public MarkupController( MarkupService markupService )
    {
        this.markupService = markupService;
    }
    @GetMapping
    public List<Markup> getMarkup(){
        return markupService.getValue();
    }

    @PostMapping
    public void registerNewValue( @RequestBody Markup markup ){
        markupService.addNewValue( markup );
    }
}
