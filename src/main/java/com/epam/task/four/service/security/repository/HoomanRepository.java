package com.epam.task.four.service.security.repository;

import com.epam.task.four.service.security.entity.Hooman;
import com.epam.task.four.service.security.entity.User;
import java.util.Optional;
import org.springframework.data.repository.ListCrudRepository;

public interface HoomanRepository extends ListCrudRepository<Hooman, String> {
}
