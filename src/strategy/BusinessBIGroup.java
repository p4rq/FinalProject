package strategy;

public class BusinessBIGroup implements AreaAndGroup {
    private double tenge;
    @Override
    public double howManySquareMeters(int squareMeters) {

        tenge = squareMeters*610000;
        System.out.println("The average price of econom " + tenge);
        return tenge;
    }
}
