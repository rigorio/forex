package sarmiento.rigo.martrust.forex;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class CurrencyServiceImpl implements CurrencyService {
    private final CurrencyRepository currencyRepository;

    @Override
    public List<CurrencyEntity> all() {
        return currencyRepository.findAll();
    }

    @Override
    public List<CurrencyEntity> addAll(List<CurrencyEntity> currencyEntityList) {
        return currencyRepository.saveAll(currencyEntityList);
    }

}
