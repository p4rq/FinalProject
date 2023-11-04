package Decorator;

import Decorator.Decor;
import Decorator.IApartment;

public class GEDGDecorator extends Decor {

    public GEDGDecorator(IApartment wrapped) {
        super(wrapped);
    }

    @Override
    public void advantages(String adv) {
        super.advantages(adv);
        System.out.println(adv + "Global Expert Development уже пятнадцать лет успешно работает в сфере строительства, ведущие подрядчики, гарантия высокого качества строительных работ.");


    }
}
