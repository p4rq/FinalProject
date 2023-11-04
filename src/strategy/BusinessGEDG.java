package strategy;

public class BusinessGEDG implements AreaAndGroup {
    private double tenge;

    @Override
    public double howManySquareMeters(int squareMeters) {
        tenge = squareMeters*520000;
        System.out.println("The average price of econom " + tenge);
        return tenge;
    }
}
