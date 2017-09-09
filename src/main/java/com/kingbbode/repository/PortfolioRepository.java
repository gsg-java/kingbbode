package com.kingbbode.repository;

import com.kingbbode.model.Portfolio;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by YG-MAC on 2017. 9. 9..
 */
public interface PortfolioRepository extends JpaRepository<Portfolio, Long> {

}