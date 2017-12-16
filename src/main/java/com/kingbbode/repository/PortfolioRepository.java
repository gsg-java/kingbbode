package com.kingbbode.repository;

import com.kingbbode.enums.Category;
import com.kingbbode.model.Portfolio;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by YG-MAC on 2017. 9. 9..
 */
public interface PortfolioRepository extends JpaRepository<Portfolio, Long> {
    List<Portfolio> findAllByCategory(Category category);
    Portfolio findByIdxAndCategory(Long idx, Category category);
}