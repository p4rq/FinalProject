package strategy;

public class EconomBazisA implements AreaAndGroup {
    private double tenge;

    @Override
    public double howManySquareMeters(int squareMeters) {
        tenge = squareMeters*370000;
        System.out.println("The average price of econom " + tenge);
        return tenge;
    }
}
