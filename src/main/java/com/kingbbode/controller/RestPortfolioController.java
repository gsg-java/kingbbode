package com.kingbbode.controller;

import com.kingbbode.model.Portfolio;
import com.kingbbode.repository.PortfolioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by YG-MAC on 2017. 11. 4..
 */
@RestController
public class RestPortfolioController {

    @Autowired
    private PortfolioRepository portfolioRepository;

    @GetMapping("/portfolios/{idx}")
    public Portfolio getPortfolio(@PathVariable String idx) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return portfolioRepository.findOne(Long.valueOf(idx));
    }
}
