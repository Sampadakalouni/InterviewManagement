package com.interviewmanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.interviewmanagement.entity.Candidate;

@Repository
public interface CandiateDao extends JpaRepository<Candidate, Integer> {

}
