package Adapter;

public class DollarConverter implements Converter {

    @Override
    public double convert(double amount, String fromCurrency, String toCurrency) {

        return amount/480;
    }
}
