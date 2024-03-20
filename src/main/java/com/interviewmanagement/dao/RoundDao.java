package com.interviewmanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.interviewmanagement.entity.Round;

@Repository
public interface RoundDao extends JpaRepository<Round, Integer> {

}
