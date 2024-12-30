package com.SUNSYSTEM.SUN_TRAVEL_SYSTEM.agent;

import com.SUNSYSTEM.SUN_TRAVEL_SYSTEM.contract.Contract;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table

public class Agent
{
    @Id
    @SequenceGenerator(
            name = "agent_sequence",
            sequenceName = "agent_sequence",
            allocationSize = 1,
            initialValue = 1000
    )
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "agent_sequence")
    private Integer agentId;

    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private boolean isAdmin;
    private String email;

//    @OneToMany(mappedBy="agent")
//    private List<Contract> contracts;

    public Agent( Integer agentId, String firstName, String lastName, String userName, String password, boolean isAdmin, String email )
    {
        this.agentId = agentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
        this.isAdmin = isAdmin;
        this.email = email;
    }

    public Agent()
    {
    }

    public Agent( String firstName, String lastName, String userName, String password, boolean isAdmin, String email )
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
        this.isAdmin = isAdmin;
        this.email = email;
    }


//    public List<Contract> getContracts()
//    {
//        return contracts;
//    }
//
//    public void setContracts( List<Contract> contracts )
//    {
//        this.contracts = contracts;
//    }

    public Integer getAgentId()
    {
        return agentId;
    }

    public void setAgentId( Integer agentId )
    {
        this.agentId = agentId;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName( String firstName )
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName( String lastName )
    {
        this.lastName = lastName;
    }

    public String getUserName()
    {
        return userName;
    }

    public void setUserName( String userName )
    {
        this.userName = userName;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword( String password )
    {
        this.password = password;
    }

    public boolean getIsAdmin()
    {
        return isAdmin;
    }
    public void setIsAdmin(boolean isAdmin){
        this.isAdmin=isAdmin;
    }

    @Override
    public String toString()
    {
        return "Agent{" +
                       "agentId=" + agentId +
                       ", firstName='" + firstName + '\'' +
                       ", lastName='" + lastName + '\'' +
                       ", userName='" + userName + '\'' +
                       ", password='" + password + '\'' +
                       ", isAdmin=" + isAdmin +
                       ", email='" + email + '\'' +
                       '}';
    }
}
