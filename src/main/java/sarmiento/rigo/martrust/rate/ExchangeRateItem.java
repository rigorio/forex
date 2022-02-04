package sarmiento.rigo.martrust.rate;

import lombok.Builder;
import lombok.Data;
import sarmiento.rigo.martrust.forex.Currency;

@Data
@Builder
public class ExchangeRateItem {
    private String currencyA;
    private String currencyB;
    private Double amountA;
}
