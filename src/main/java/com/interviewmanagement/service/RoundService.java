package com.interviewmanagement.service;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.interviewmanagement.dao.RoundDao;

import com.interviewmanagement.entity.Round;

@Service
public class RoundService {

	@Autowired
	private RoundDao roundDao;
	public Round saveRounds(Round round) {
	
		round.setRoundId(null);
		// TODO Auto-generated method stub
		return this.roundDao.saveAndFlush(round);
	}
    
	 public String  deleteRound(Integer roundId) {
		// TODO Auto-generated method stub
		 this.roundDao.deleteById(roundId);
		 return "You Have Sucessfully deleted the round you have entered";
		
	}

	public Object updateRounds(Round  round) {
		if(round.getRoundId() != null)
		{
			return this.roundDao.saveAndFlush(round);
		}
		else
		{
			return "Invalid update operation";
		}
	}

	 
	
}
