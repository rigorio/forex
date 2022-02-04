package sarmiento.rigo.martrust.forex;

import java.util.List;

public interface CurrencyService {
    List<CurrencyEntity> all();

    List<CurrencyEntity> addAll(List<CurrencyEntity> currencyEntityList);
}
