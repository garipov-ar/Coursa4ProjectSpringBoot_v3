package ru.garipov.kursa4.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.garipov.kursa4.entity.UserAction;
import ru.garipov.kursa4.service.UserActionService;

import java.util.List;

@Controller
public class UserActionController {

    private final UserActionService userActionService; // Предположим, что у вас есть сервис для работы с действиями пользователей

    @Autowired
    public UserActionController(UserActionService userActionService) {
        this.userActionService = userActionService;
    }

    @GetMapping("/user-actions")
    public String showUserActions(Model model) {
        List<UserAction> userActions = userActionService.getAllUserActions();
        model.addAttribute("userActions", userActions);
        return "actions";
    }
}
