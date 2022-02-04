package sarmiento.rigo.martrust.rate;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sarmiento.rigo.martrust.forex.CurrencyEntity;
import sarmiento.rigo.martrust.forex.CurrencyNotFoundException;
import sarmiento.rigo.martrust.forex.CurrencyService;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class USDStandardOfRateService implements StandardOfRateService {
    private final CurrencyService currencyService;

    @Override
    public CurrencyEntity getStandardOfRates() {
        return currencyService.findByCurrency("USD")
                .orElse(currencyService.add(CurrencyEntity.builder()
                                                    .label("USD")
                                                    .value(1.00)
                                                    .dateAdded(LocalDateTime.now())
                                                    .build()));
    }

    @Override
    public double getRate(ExchangeRateItem item) {
        CurrencyEntity currencyA = currencyService.findByCurrency(item.getCurrencyA())
                .orElseThrow(CurrencyNotFoundException::new);
        CurrencyEntity currencyB = currencyService.findByCurrency(item.getCurrencyB())
                .orElseThrow(CurrencyNotFoundException::new);
        CurrencyEntity usdStandard = getStandardOfRates();
        Double amount = item.getAmountA();
        double ratio = usdStandard.getValue() / currencyA.getValue();
        double amountInStandard = ratio * amount;
        return amountInStandard * currencyB.getValue();
    }
}
