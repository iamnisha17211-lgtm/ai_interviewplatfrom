package com.nisha.aiintervi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nisha.aiintervi.service.Interviewservice;

import com.nisha.aiintervi.model.InterviewQuestion;

	@RestController
	
	public class HomeController {

	    @Autowired
	    private Interviewservice service;

	    @GetMapping("/questions")
	    public List<InterviewQuestion> getQuestions() {
	        return service.getQuestions();
	    }
	}

