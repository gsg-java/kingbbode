package com.kingbbode.controllers;

import com.kingbbode.service.PortfolioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by YG-MAC on 2017. 9. 8..
 */
@Controller
public class HomeController {

    @Autowired
    private PortfolioService portfolioService;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("portfolios", portfolioService.findAll());
        return "home";
    }
}
