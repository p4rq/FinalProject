package strategy;

public class EconomGEDG implements AreaAndGroup {
    private double tenge;

    @Override
    public double howManySquareMeters(int squareMeters) {
        tenge = squareMeters*277000;
        System.out.println("The average price of econom " + tenge);
        return tenge;
    }
}
