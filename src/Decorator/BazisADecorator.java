package Decorator;

import Decorator.Decor;
import Decorator.IApartment;

public class BazisADecorator extends Decor {
    public BazisADecorator(IApartment wrapped) {
        super(wrapped);
    }
    @Override
    public void advantages(String adv){
        super.advantages(adv);
        System.out.println(adv + "BAZIS-A — крупнейший застройщик Казахстана, работает на строительном рынке с 1991 года и имеет высочайшую репутацию лидера строительной индустрии Казахстана.");


    }

    public static class Apartment implements IApartment {
        private final String name;
        private final BuyerName buyerName;


        public Apartment(String name){
            this.name = name;
            buyerName = new BuyerName();

        }

        @Override
        public void advantages(String adv){
            String buyer = buyerName.getName(name);
            System.out.println(adv + buyer);
        }

    }
}
