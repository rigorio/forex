package sarmiento.rigo.martrust.forex;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CurrencyRepository {

    List<CurrencyEntity> findAll();

    List<CurrencyEntity> saveAll(List<CurrencyEntity> currencyList);
}
