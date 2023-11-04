package Factoryv2;

public class AlmatyDistFactory extends DistrictFactory{
    @Override
    protected IDistricts chooseDistrict() {
        return new AlmatyDistrict();
    }
}
