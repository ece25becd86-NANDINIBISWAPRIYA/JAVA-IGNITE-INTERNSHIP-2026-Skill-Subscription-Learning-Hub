package com.skills.hub.controller;

import com.skills.hub.model.User;
import com.skills.hub.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/*
=========================================================
WHAT IS THIS FILE?
Handles user actions like register and login
=========================================================
*/

@Controller
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/register")
    public String showRegisterPage() {

        // =========================
        // TASK
        // =========================
        // STEP 1: Return register page

        return null; // TODO: "register"
        return "register";
    }

    @PostMapping("/register")
    public String registerUser(@ModelAttribute User user) {
    public String registerUser(@ModelAttribute User user, Model model) {

        User savedUser = userService.registerUser(user);

        if (savedUser != null) {
            return "redirect:/login";
        }

        // =========================
        //TASK
        // =========================
        // STEP 1: call service.registerUser(user)
        // STEP 2: if success → redirect to login
        // STEP 3: else → stay on register page
        model.addAttribute("message", "Email already registered");

        return null;
        return "register";
    }

    @GetMapping("/login")
    public String showLoginPage() {

        // STEP 1: return login page

        return null; // TODO: "login"
        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam String email,
                         @RequestParam String password) {
                        @RequestParam String password) {

        // =========================
        // PSEUDO CODE
        // =========================
        // STEP 1: call userService.login(email, password)
        // STEP 2: if user != null → redirect /packs
        // STEP 3: else → return login page again
        User user = userService.login(email, password);

        return null;
        if (user != null) {
            return "redirect:/packs";
        }

        return "login";
    }

	public UserService getUserService() {
		return userService;
	}
    public UserService getUserService() {
        return userService;
    }
}
