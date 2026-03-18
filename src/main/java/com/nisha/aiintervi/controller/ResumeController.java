package com.nisha.aiintervi.controller;


import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@CrossOrigin
public class ResumeController {

    @PostMapping("/analyze-resume")
    public Map<String, Object> analyze(@RequestBody Map<String, String> data) {

        String text = data.get("text").toLowerCase();

        List<String> skills = Arrays.asList("java","python","c++","teamwork");
        int score = 0;

        for(String skill : skills){
            if(text.contains(skill)){
                score += 20;
            }
        }

        String feedback = score > 40 ? "Strong Resume" : "Improve your skills";

        Map<String, Object> result = new HashMap<>();
        result.put("score", score);
        result.put("feedback", feedback);

        return result;
    }
}


