package ru.rudolf.restfuldemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.rudolf.restfuldemo.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
