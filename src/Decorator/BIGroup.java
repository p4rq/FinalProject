package Decorator;

public class BIGroup extends GroupDecorator {
    public BIGroup(IApartment apartment) {
        super(apartment);
    }

    @Override
    public String decorate() {
        return super.decorate() + decorateBiGroup();
    }
    private String decorateBiGroup(){
        return "BI Group — крупнейший строительный холдинг, лидер на рынке недвижимости Казахстана. " +
                "Холдинг работает с 1995 года и за это время заслужил репутацию профессионала и надёжного партнёра," +
                "главная миссия которого — дарить людям счастье и комфорт.";
    }
}
