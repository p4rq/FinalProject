package Decorator;

public class GroupDecorator implements IApartment{
    private IApartment apartment;
    public GroupDecorator(IApartment apartment){
        this.apartment=apartment;
    }
    @Override
    public String decorate() {
        return apartment.decorate();
    }
}
