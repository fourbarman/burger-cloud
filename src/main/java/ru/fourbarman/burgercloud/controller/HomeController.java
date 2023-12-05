package ru.fourbarman.burgercloud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * HomeController.
 *
 * @author fourbarman (maks.java@yandex.ru).
 * @version $Id$.
 * @since 05.12.2023.
 */
@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "home";
    }
}
