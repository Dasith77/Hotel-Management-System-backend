package com.SUNSYSTEM.SUN_TRAVEL_SYSTEM.markup;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table
public class Markup
{
    @Id
    @SequenceGenerator(
            name="markup_sequence",
                              sequenceName = "markup_sequence",
                              allocationSize =1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
                           generator = "markup_sequence"
    )
    private Integer id;
    private Integer value;



    public Markup( Integer id, Integer value )
    {
        this.id = id;
        this.value = value;
    }

    public Markup()
    {
    }

    public Integer getId()
    {
        return id;
    }

    public void setId( Integer id )
    {
        this.id = id;
    }

    public Integer getValue()
    {
        return value;
    }

    public void setValue( Integer value )
    {
        this.value = value;
    }


}
