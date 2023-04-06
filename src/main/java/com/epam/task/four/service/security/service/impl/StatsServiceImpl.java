package com.epam.task.four.service.security.service.impl;

import com.epam.task.four.service.security.entity.Stats;
import com.epam.task.four.service.security.repository.StatsRepository;
import com.epam.task.four.service.security.service.StatsService;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class StatsServiceImpl implements StatsService {
    private final StatsRepository statsRepository;

    public StatsServiceImpl(StatsRepository statsRepository) {
        this.statsRepository = statsRepository;
    }

    @Override
    public List<Stats> getAllStats() {
        return statsRepository.findAll();
    }

    @Override
    public Stats getStatsById(String id) {
        return statsRepository.findById(id).orElse(null);
    }

    @Override
    public Stats addStats(Stats stats) {
        return statsRepository.save(stats);
    }
}
