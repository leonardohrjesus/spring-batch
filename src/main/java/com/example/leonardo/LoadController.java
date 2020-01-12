package com.example.leonardo;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/load")
public class LoadController {
	

    @Autowired
    JobLauncher jobLauncher;

    @Autowired
    Job job;
	
	  @GetMapping
	   public String load() {
		  
		  return "teste";
		  
		  
	  }

}
