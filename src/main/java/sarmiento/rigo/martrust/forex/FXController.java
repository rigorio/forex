package sarmiento.rigo.martrust.forex;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sarmiento.rigo.martrust.util.SeedUtil;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/fx")
public class FXController {

    private final CurrencyService currencyService;

    @GetMapping("/currencies")
    public ResponseEntity<List<Currency>> all() {
        return new ResponseEntity<>(adaptToCurrency(currencyService.all()), HttpStatus.OK);
    }

    @PostMapping("/currencies")
    public ResponseEntity<List<Currency>> saveAll(@RequestBody List<Currency> currencies) {
        return new ResponseEntity<>(adaptToCurrency(currencyService.addAll(currencies.stream().map(CurrencyEntity::new).collect(Collectors.toList()))), HttpStatus.ACCEPTED);
    }

    @PostMapping("/seed")
    public ResponseEntity<List<Currency>> seedData() {
        return new ResponseEntity<>(adaptToCurrency(currencyService.addAll(SeedUtil.generateCurrencies())), HttpStatus.ACCEPTED);
    }

    private List<Currency> adaptToCurrency(List<CurrencyEntity> currencies) {
        return currencies.stream().map(Currency::new).collect(Collectors.toList());
    }
}
