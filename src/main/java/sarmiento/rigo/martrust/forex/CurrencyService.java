package sarmiento.rigo.martrust.forex;

import java.util.List;
import java.util.Optional;

public interface CurrencyService {
    List<CurrencyEntity> all();

    List<CurrencyEntity> addAll(List<CurrencyEntity> currencyEntityList);

    CurrencyEntity add(CurrencyEntity currency);

    Optional<CurrencyEntity> findByCurrency(String currency);

    void deleteAll();
}
