package com.nisha.aiintervi.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.nisha.aiintervi.model.Result;
import com.nisha.aiintervi.repository.ResultRepository;


@RestController
@CrossOrigin
public class InterviewController {

    @Autowired
    private ResultRepository repo;

    @PostMapping("/save-result")
    public String saveResult(@RequestBody Result result) {
        repo.save(result);
        return "Result Saved";
    }
}

