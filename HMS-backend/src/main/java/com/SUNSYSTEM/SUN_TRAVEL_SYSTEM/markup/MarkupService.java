package com.SUNSYSTEM.SUN_TRAVEL_SYSTEM.markup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MarkupService
{
    private final MarkupRepository markupRepository;

    @Autowired
    public MarkupService( MarkupRepository markupRepository )
    {
        this.markupRepository = markupRepository;
    }
    public List<Markup> getValue()
    {
        return markupRepository.findAll();
    }
    public void addNewValue( Markup markup){
        Optional<Markup> valueOptional = markupRepository.findValue(markup.getValue());
        if(valueOptional.isPresent()){
            throw new IllegalStateException("this value has already added");
        }
        markupRepository.save( markup );
    }
}
