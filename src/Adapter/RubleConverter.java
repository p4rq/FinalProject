package Adapter;

public class RubleConverter implements Converter{

    @Override
    public double convert(double amount, String fromCurrency, String toCurrency) {
        return amount/5;
    }
}
