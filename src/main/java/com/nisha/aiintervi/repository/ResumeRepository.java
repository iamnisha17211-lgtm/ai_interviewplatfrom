package com.nisha.aiintervi.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.nisha.aiintervi.model.Resume;


public interface ResumeRepository extends JpaRepository<Resume, Long> {
}

