package sarmiento.rigo.martrust.forex;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CurrencyRepositoryImpl implements CurrencyRepository {

    private final static List<CurrencyEntity> currencies = new ArrayList<>();

    @Override
    public List<CurrencyEntity> findAll() {
        return currencies;
    }

    @Override
    public List<CurrencyEntity> saveAll(List<CurrencyEntity> currencyList) {
        currencies.addAll(currencyList);
        return currencyList;
    }

}
