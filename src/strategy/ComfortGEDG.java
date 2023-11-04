package strategy;

public class ComfortGEDG implements AreaAndGroup {
    private double tenge;

    @Override
    public double howManySquareMeters(int squareMeters) {
        tenge = squareMeters*412000;
        System.out.println("The average price of econom " + tenge);
        return tenge;
    }
}
