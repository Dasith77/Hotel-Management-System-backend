package com.SUNSYSTEM.SUN_TRAVEL_SYSTEM.agent;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="api/v1/agent")
public class AgentController
{
    private final AgentService agentService;

    @Autowired
    public AgentController( AgentService agentService )
    {
        this.agentService = agentService;
    }

    @GetMapping
    public List<Agent> getAgents(){
        return agentService.getAgents();
    }

    @PostMapping
    public void registerNewAgent( @RequestBody Agent agent ){
        agentService.addNewAgent(agent);
    }
}
