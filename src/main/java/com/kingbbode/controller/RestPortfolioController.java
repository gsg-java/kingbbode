package com.kingbbode.controller;

import com.kingbbode.enums.Category;
import com.kingbbode.model.Portfolio;
import com.kingbbode.repository.PortfolioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.beans.PropertyEditorSupport;

/**
 * Created by YG-MAC on 2017. 11. 4..
 */
@RestController
public class RestPortfolioController {

    @Autowired
    private PortfolioRepository portfolioRepository;

    @GetMapping("/portfolios/{category}/{idx}")
    public Portfolio getPortfolio(@PathVariable Category category, @PathVariable String idx) {
        return portfolioRepository.findByIdxAndCategory(Long.valueOf(idx), category);
    }

    @InitBinder
    public void initBinder(WebDataBinder binder){
        binder.registerCustomEditor(Category.class, new PropertyEditorSupport() {
            @Override
            public void setAsText(String text) throws IllegalArgumentException {
                super.setValue(Category.valueOf(text.toUpperCase()));
            }
        });
    }

}
