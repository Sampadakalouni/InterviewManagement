package com.interviewmanagement.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.interviewmanagement.entity.JobPosting;

@Repository
public interface JobPostingDao extends JpaRepository<JobPosting, String> {
	 Optional<JobPosting> findById(String jobId);

}
