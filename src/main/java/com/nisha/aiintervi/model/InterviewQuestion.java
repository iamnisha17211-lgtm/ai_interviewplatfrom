package com.nisha.aiintervi.model;



	import jakarta.persistence.Entity;
	import jakarta.persistence.Id;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
	@Entity
	public class InterviewQuestion {
        @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;
	    private String question;
	    private String answers;

	    // Default constructor (IMPORTANT)
	    public InterviewQuestion() {
	    }

	  
	}

