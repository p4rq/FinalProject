package Decorator;

public class GroupImpl implements IApartment{
    @Override
    public String decorate() {
        return "Group, ";
    }
}
