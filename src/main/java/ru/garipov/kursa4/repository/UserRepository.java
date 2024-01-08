package ru.garipov.kursa4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.garipov.kursa4.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
