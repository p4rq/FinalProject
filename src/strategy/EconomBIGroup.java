package strategy;

public class EconomBIGroup implements AreaAndGroup {
    private double tenge;
    @Override
    public double howManySquareMeters(int squareMeters) {
        tenge = squareMeters*333000;
        System.out.println("The average price of econom " + tenge);
        return tenge;
    }
}
