package ru.garipov.kursa4.service;

import org.springframework.stereotype.Service;
import ru.garipov.kursa4.entity.UserAction;
import ru.garipov.kursa4.repository.UserActionRepository;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserActionService {

    private final UserActionRepository userActionRepository;

    public UserActionService(UserActionRepository userActionRepository) {
        this.userActionRepository = userActionRepository;
    }

    public void logUserAction(String userEmail, String action) {
        System.out.println("Received userEmail: " + userEmail);
        UserAction userAction = new UserAction();
        userAction.setUserEmail(userEmail);
        userAction.setAction(action);
        userAction.setTimestamp(LocalDateTime.now());

        userActionRepository.save(userAction);
    }

    public List<UserAction> getAllUserActions() {
        return userActionRepository.findAll();
    }
}
