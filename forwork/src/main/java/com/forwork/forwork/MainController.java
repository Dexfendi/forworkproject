package com.forwork.forwork;

import com.forwork.forwork.forum.user.User;
import com.forwork.forwork.forum.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @Autowired
    private UserRepository userRepository;

        @GetMapping("/")
        public String home(Model model) {
            Iterable<User> users = userRepository.findAll();
            model.addAttribute("users", users);
            return "home";
        }

}
