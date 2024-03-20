package com.interviewmanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.interviewmanagement.entity.InterviewSchedule;

@Repository
public interface InterviewScheduleDao extends JpaRepository<InterviewSchedule, Integer> {

}
