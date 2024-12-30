package com.SUNSYSTEM.SUN_TRAVEL_SYSTEM.agent;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AgentService
{
    private final AgentRepository agentRepository;

    @Autowired
    public AgentService( AgentRepository agentRepository )
    {
        this.agentRepository = agentRepository;
    }


    public List<Agent> getAgents()
    {
        return agentRepository.findAll();
    }

    public void addNewAgent(Agent agent){
        Optional<Agent> agentOptional = agentRepository.findAgentByagentId( agent.getAgentId() );
        if(agentOptional.isPresent()){
            throw new IllegalStateException("this agent ID is already taken...");
        }
        agentRepository.save(agent);

    }



}
