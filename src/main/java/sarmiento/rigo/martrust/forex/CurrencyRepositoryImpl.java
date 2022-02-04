package sarmiento.rigo.martrust.forex;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

    @Override
    public Optional<CurrencyEntity> findByLabel(String label) {
        return currencies.stream()
                .filter(currency -> currency.getLabel().equals(label))
                .findFirst();
    }

}
