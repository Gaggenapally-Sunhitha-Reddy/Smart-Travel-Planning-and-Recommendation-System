package com.example.demo.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.TravelHistory;

public interface TravelHistoryRepository extends JpaRepository<TravelHistory,Long>{

    List<TravelHistory> findByUserId(Long userId);

}