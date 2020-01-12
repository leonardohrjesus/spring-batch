package com.example.leonardo.service;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.leonardo.model.Autobot;
import com.example.leonardo.repository.AutobotRepository;



@Component
public class DBWriter implements ItemWriter<Autobot> {
	
    @Autowired
    private AutobotRepository   autobotRepository;

    @Override
    public void write(List<? extends Autobot> autobot) throws Exception {

        System.out.println("Data Saved for usuarios: " + autobot);
        autobotRepository.saveAll(autobot);
    }
}