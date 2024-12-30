package com.SUNSYSTEM.SUN_TRAVEL_SYSTEM.roomType;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table
public class RoomType
{
    @Id
    @SequenceGenerator(
            name="roomType_sequence",
                              sequenceName = "roomType_sequence",
                              allocationSize =1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
                           generator = "roomType_sequence"
    )
    private Integer id;
    private String type;



    public RoomType( Integer id, String type )
    {
        this.id = id;
        this.type = type;
    }

    public RoomType()
    {
    }

    public RoomType( String type )
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

    public String getType()
    {
        return type;
    }

    public void setType( String type )
    {
        this.type = type;
    }

    @Override
    public String toString()
    {
        return "RoomType{" +
                       "id=" + id +
                       ", type='" + type + '\'' +
                       '}';
    }
}
