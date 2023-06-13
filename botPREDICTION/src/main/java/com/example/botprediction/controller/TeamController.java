package com.example.botprediction.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.botprediction.entities.Team;
import com.example.botprediction.model.TeamDTO;
import com.example.botprediction.service.TeamService;

@RestController
@RequestMapping("/teams")
public class TeamController {
    private final TeamService teamService;

    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }

    @GetMapping("/{teamId}")
    public TeamDTO getTeamById(@PathVariable Long teamId) {
        Team team = teamService.getTeamById(teamId);
        return mapTeamEntityToDto(team);
    }

	private TeamDTO mapTeamEntityToDto(Team team) {
		// TODO Auto-generated method stub
		return null;
	}

    // Altri metodi per il recupero, l'aggiornamento e la cancellazione delle squadre
}
