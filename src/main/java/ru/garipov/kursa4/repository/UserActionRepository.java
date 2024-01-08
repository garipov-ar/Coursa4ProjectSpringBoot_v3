package ru.garipov.kursa4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.garipov.kursa4.entity.UserAction;

public interface UserActionRepository extends JpaRepository<UserAction, Long> {


}

