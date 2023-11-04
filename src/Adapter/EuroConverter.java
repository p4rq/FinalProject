package Adapter;

public class EuroConverter implements Converter{
    @Override
    public double convert(double amount, String fromCurrency, String toCurrency) {
        return amount/506;
    }
}
