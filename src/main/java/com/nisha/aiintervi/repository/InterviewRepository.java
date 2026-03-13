package com.nisha.aiintervi.repository;
	
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.nisha.aiintervi.model.InterviewQuestion;


    @Repository
	public interface InterviewRepository extends JpaRepository<InterviewQuestion, Integer>{

	}

