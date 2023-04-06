package com.epam.task.four.service.security.controller;

import com.epam.task.four.service.security.entity.Stats;
import com.epam.task.four.service.security.service.StatsService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/about")
public class StatsController {
    private final StatsService statsService;

    public StatsController(StatsService statsService) {
        this.statsService = statsService;
    }

    @GetMapping
    public List<Stats> getAllStats() {
        return statsService.getAllStats();
    }

    @GetMapping("/{id}")
    public Stats getStatsById(@PathVariable String id) {
        return statsService.getStatsById(id);
    }

    @PostMapping
    public Stats addStats(@RequestBody Stats stats) {
        return statsService.addStats(stats);
    }
}
