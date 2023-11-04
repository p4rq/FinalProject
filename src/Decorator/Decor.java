package Decorator;

import Decorator.IApartment;

public abstract class Decor implements IApartment {
    private final IApartment wrapped;
    protected final BuyerName name;

    Decor(IApartment wrapped){
        this.wrapped = wrapped;
        name = new BuyerName();
    }


    @Override
    public void advantages(String advantages) {
        wrapped.advantages(advantages);
    }
}
