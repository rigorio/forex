package sarmiento.rigo.martrust.forex;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CurrencyRepository {

    List<CurrencyEntity> findAll();

    List<CurrencyEntity> saveAll(List<CurrencyEntity> currencyList);

    Optional<CurrencyEntity> findByLabel(String label);

    CurrencyEntity save(CurrencyEntity currency);
}
