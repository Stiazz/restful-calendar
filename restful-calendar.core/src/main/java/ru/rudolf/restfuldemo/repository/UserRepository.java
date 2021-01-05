package ru.rudolf.restfuldemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.rudolf.restfuldemo.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String name);
}
