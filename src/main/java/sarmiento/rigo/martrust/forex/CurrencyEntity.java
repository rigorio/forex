package sarmiento.rigo.martrust.forex;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CurrencyEntity {
    private String label;
    private Double value;
    private LocalDateTime dateAdded;

    public CurrencyEntity(Currency currency) {
        this.label = currency.getLabel();
        this.value = currency.getValue();
        this.dateAdded = LocalDateTime.now();
    }
}
