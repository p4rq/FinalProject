package strategy;

public class ComfortBazisA implements AreaAndGroup {
    private double tenge;

    @Override
    public double howManySquareMeters(int squareMeters) {
        tenge = squareMeters*378000;
        System.out.println("The average price of econom " + tenge);
        return tenge;
    }
}
