package com.epam.task.four.service.security.repository;

import com.epam.task.four.service.security.entity.Stats;
import org.springframework.data.repository.ListCrudRepository;

public interface StatsRepository extends ListCrudRepository<Stats, String> {
}
