package com.SUNSYSTEM.SUN_TRAVEL_SYSTEM.DTO;

public class RoomTypeDTO
{
    private String type;
    private Integer id;

    public RoomTypeDTO( String type, Integer id )
    {
        this.type = type;
        this.id = id;
    }

    public RoomTypeDTO( String type )
    {
        this.type = type;
    }

    public String getType()
    {
        return type;
    }

    public void setType( String type )
    {
        this.type = type;
    }

    public Integer getId()
    {
        return id;
    }

    public void setId( Integer id )
    {
        this.id = id;
    }


}
