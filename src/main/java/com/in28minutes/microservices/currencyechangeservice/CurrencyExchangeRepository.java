package com.in28minutes.microservices.currencyechangeservice;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange, Long> {

    CurrencyExchange findByFromAndTo(String from, String To);
    List<CurrencyExchange> findByTo(String to);

}
