package sarmiento.rigo.martrust.util;

import sarmiento.rigo.martrust.forex.CurrencyEntity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SeedUtil {
    public static List<CurrencyEntity> generateCurrencies() {
        CurrencyEntity php = CurrencyEntity.builder()
                .label("PHP")
                .value(51.16)
                .dateAdded(LocalDateTime.now())
                .build();
        CurrencyEntity usd = CurrencyEntity.builder()
                .label("USD")
                .value(1.00)
                .dateAdded(LocalDateTime.now())
                .build();
        CurrencyEntity jpy = CurrencyEntity.builder()
                .label("JPY")
                .value(114.98)
                .dateAdded(LocalDateTime.now())
                .build();
        return new ArrayList<>(Arrays.asList(php,
                                             usd,
                                             jpy));
    }
}
