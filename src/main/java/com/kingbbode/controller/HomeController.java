package com.kingbbode.controller;

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

    private PortfolioService portfolioService;

    @Autowired
    public HomeController(PortfolioService portfolioService) {
        this.portfolioService = portfolioService;
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("portfolios", portfolioService.findAll());
        return "home";
    }
}
