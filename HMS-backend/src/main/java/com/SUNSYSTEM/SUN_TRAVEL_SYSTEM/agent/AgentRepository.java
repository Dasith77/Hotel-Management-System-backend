package com.SUNSYSTEM.SUN_TRAVEL_SYSTEM.agent;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AgentRepository extends JpaRepository<Agent, Integer>
{

    @Query("SELECT c FROM Agent c WHERE c.agentId = ?1")
    Optional<Agent> findAgentByagentId(Integer agentId);


                                                                      }
