package sarmiento.rigo.martrust;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import sarmiento.rigo.martrust.forex.CurrencyEntity;
import sarmiento.rigo.martrust.forex.CurrencyRepository;
import sarmiento.rigo.martrust.forex.CurrencyService;
import sarmiento.rigo.martrust.forex.CurrencyServiceImpl;
import sarmiento.rigo.martrust.util.SeedUtil;

import java.util.List;


@RunWith(MockitoJUnitRunner.class)
public class CurrencyServiceImplTest {

    @Mock
    private CurrencyServiceImpl currencyService;
    @Mock
    private CurrencyRepository currencyRepository;

    @BeforeEach
    public void init() {
        currencyRepository = Mockito.mock(CurrencyRepository.class);
        currencyService = new CurrencyServiceImpl(currencyRepository);
    }

    @Test
    public void testFindAll() {
        List<CurrencyEntity> currencies = SeedUtil.generateCurrencies();
        Mockito.when(currencyRepository.findAll()).thenReturn(currencies);
        Assertions.assertEquals(currencies, currencyService.all());
    }
}
