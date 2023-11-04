package Factoryv2;

public class NuraDistFactory extends DistrictFactory{
    @Override
    protected IDistricts chooseDistrict() {
        return new NuraDistrict();
    }
}
