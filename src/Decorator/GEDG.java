package Decorator;

public class GEDG extends GroupDecorator{
    public GEDG(IApartment apartment) {
        super(apartment);
    }

    @Override
    public String decorate() {
        return super.decorate() + decorateGEDG();
    }
    private String decorateGEDG(){
        return "Global Expert Development уже пятнадцать лет успешно работает в сфере строительства," +
                " ведущие подрядчики, гарантия высокого качества строительных работ.";
    }
}
