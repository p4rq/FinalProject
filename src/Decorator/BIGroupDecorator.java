package Decorator;

import Decorator.Decor;
import Decorator.IApartment;

public class BIGroupDecorator extends Decor {
    public BIGroupDecorator(IApartment wrapped) {
        super(wrapped);
    }
    @Override
    public void advantages(String adv){
        super.advantages(adv);
        System.out.println(adv + "BI Group — крупнейший строительный холдинг, лидер на рынке недвижимости Казахстана. Холдинг работает с 1995 года и за это время заслужил репутацию профессионала и надёжного партнёра, главная миссия которого — дарить людям счастье и комфорт.");

    }
}
