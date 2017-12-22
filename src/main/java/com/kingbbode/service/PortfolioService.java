package com.kingbbode.service;

import com.kingbbode.enums.Category;
import com.kingbbode.model.Portfolio;
import com.kingbbode.repository.PortfolioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by YG-MAC on 2017. 9. 9..
 */
@Service
public class PortfolioService {

    @Autowired
    private PortfolioRepository portfolioRepository;

    public Map<String, List<Portfolio>> findAll() {
        Map<String, List<Portfolio>> map = new HashMap<>();
        map.put("projects", this.portfolioRepository.findAllByCategory(Category.PROJECT));
        map.put("activities", this.portfolioRepository.findAllByCategory(Category.ACTIVITY));
        map.put("careers", this.portfolioRepository.findAllByCategory(Category.CAREER));
        return map;
    }
}
