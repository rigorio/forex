package sarmiento.rigo.martrust.forex;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Currency {

    private String label;
    private Double value;

    public Currency(CurrencyEntity currencyEntity) {
        this.label = currencyEntity.getLabel();
        this.value = currencyEntity.getValue();
    }
}
