package strategy;

public class BusinessBazisA implements AreaAndGroup {
    private double tenge;
    @Override
    public double howManySquareMeters(int squareMeters) {
        tenge = squareMeters*547000;
        System.out.println("The average price of econom " + tenge);
        return tenge;

    }
}
