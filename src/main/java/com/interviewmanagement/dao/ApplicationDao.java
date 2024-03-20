package com.interviewmanagement.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.interviewmanagement.entity.Application;

@Repository
public interface ApplicationDao extends JpaRepository<Application, Integer> {

	List<Application> findBySubmissionDate(String submisssionDate);

}
