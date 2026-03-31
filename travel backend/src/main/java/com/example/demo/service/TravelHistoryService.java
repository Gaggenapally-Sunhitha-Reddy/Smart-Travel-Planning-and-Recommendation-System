package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.TravelHistory;
import com.example.demo.repository.TravelHistoryRepository;

@Service
public class TravelHistoryService {

    @Autowired
    private TravelHistoryRepository repo;

    public TravelHistory saveHistory(TravelHistory h){
        return repo.save(h);
    }

    public List<TravelHistory> getUserHistory(Long userId){
        return repo.findByUserId(userId);
    }
}