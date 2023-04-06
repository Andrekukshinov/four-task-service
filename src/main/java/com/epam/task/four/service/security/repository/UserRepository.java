package com.epam.task.four.service.security.repository;

import com.epam.task.four.service.security.entity.User;
import java.util.Optional;
import org.springframework.data.repository.ListCrudRepository;

public interface UserRepository extends ListCrudRepository<User, String> {
    Optional<User> findByUsername(String username);

}
