package sarmiento.rigo.martrust.rate;

import sarmiento.rigo.martrust.forex.CurrencyEntity;

public interface StandardOfRateService {
    CurrencyEntity getStandardOfRates();

    double getRate(ExchangeRateItem item);
}
