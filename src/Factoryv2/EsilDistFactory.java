package Factoryv2;

public class EsilDistFactory extends DistrictFactory{
    @Override
    protected IDistricts chooseDistrict() {
        return new EsilDistrict();
    }
}
