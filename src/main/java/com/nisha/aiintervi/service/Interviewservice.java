
package com.nisha.aiintervi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nisha.aiintervi.model.InterviewQuestion;
import com.nisha.aiintervi.repository.InterviewRepository;

@Service
public class Interviewservice {
	@Autowired

	private InterviewRepository repo;

	public List<InterviewQuestion> getQuestions() {
		return repo.findAll();

	}
}

//List<InterviewQuestion> list = new ArrayList<>();

//list.add(new InterviewQuestion(1,
// "What is Java?",
// "Java is an object oriented programming language"));

//list.add(new InterviewQuestion(2,
// "What is Spring Boot?",
// "Spring Boot is framework for building Java web applications"));

//return list;
