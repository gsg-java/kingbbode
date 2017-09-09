package com.kingbbode.service;

import com.kingbbode.model.Portfolio;
import com.kingbbode.repository.PortfolioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by YG-MAC on 2017. 9. 9..
 */
@Service
public class PortfolioService {

    @Autowired
    private PortfolioRepository portfolioRepository;

    public List<Portfolio> findAll() {
        return portfolioRepository.findAll();
    }

    public Portfolio findOne(Long id) {
        return portfolioRepository.findOne(id);
    }
}
