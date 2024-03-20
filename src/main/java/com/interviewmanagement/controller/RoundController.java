package com.interviewmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.interviewmanagement.entity.Round;
import com.interviewmanagement.service.RoundService;


@RestController
public class RoundController {
	
	@Autowired
	private RoundService roundService;

	@PostMapping("/saverounds")
	public Round saveRounds(@RequestBody Round round)
	{
		return this.roundService.saveRounds(round);
	}
	
	@GetMapping("/deleterounds/{roundId}")
	public String deleteRounds(@PathVariable("roundId") Integer roundId)
	{
	
		return this.roundService.deleteRound(roundId);
	}

	@PostMapping("/updaterounds")
	public Object updateRounds(@RequestBody Round  round)
	{
		return this.roundService.updateRounds(round);
	}
}
