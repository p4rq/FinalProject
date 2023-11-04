package strategy;

public class ComfortBIGroup implements AreaAndGroup {
    private double tenge;
    @Override
    public double howManySquareMeters(int squareMeters) {
        tenge = squareMeters*440000;
        System.out.println("The average price of econom " + tenge);
        return tenge;
    }
}
