package Adapter;

public class ConverterAdapter implements Converter {
    private Converter converter;

    public ConverterAdapter(String choice) {
        if (choice.equalsIgnoreCase("Dollar")) {
            converter = new DollarConverter();
        } else if (choice.equalsIgnoreCase("Euro")) {
            converter = new EuroConverter();
        } else if (choice.equalsIgnoreCase("Ruble")) {
            converter = new RubleConverter();
        }
    }

    @Override
    public double convert(double amount, String fromCurrency, String toCurrency) {
        return converter.convert(amount, fromCurrency, toCurrency);
    }
}
