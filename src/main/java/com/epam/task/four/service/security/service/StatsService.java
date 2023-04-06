package com.epam.task.four.service.security.service;

import com.epam.task.four.service.security.entity.Stats;
import java.util.List;

public interface StatsService {
    List<Stats> getAllStats();
    Stats getStatsById(String id);
    Stats addStats(Stats stats);
}