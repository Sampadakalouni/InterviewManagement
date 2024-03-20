package com.interviewmanagement.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.interviewmanagement.entity.Interview;
import com.interviewmanagement.entity.InterviewFeedback;

@Repository
public interface InterviewFeedbackDao extends JpaRepository<InterviewFeedback, Integer> {

	List<InterviewFeedback> findByInterview(Interview interview);
}
