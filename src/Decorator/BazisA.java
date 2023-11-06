package Decorator;

public class BazisA extends GroupDecorator{
    public BazisA(IApartment apartment) {
        super(apartment);
    }

    @Override
    public String decorate() {
        return super.decorate() + decorateBazisA();
    }
    private String decorateBazisA(){
        return "BAZIS-A — крупнейший застройщик Казахстана, работает на строительном рынке с 1991 года" +
                " и имеет высочайшую репутацию лидера строительной индустрии Казахстана.";
    }
}
