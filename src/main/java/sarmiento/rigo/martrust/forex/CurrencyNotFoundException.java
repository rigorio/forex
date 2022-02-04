package sarmiento.rigo.martrust.forex;

public class CurrencyNotFoundException extends RuntimeException{
    public CurrencyNotFoundException() {
    }

    public CurrencyNotFoundException(String message) {
        super(message);
    }
}
