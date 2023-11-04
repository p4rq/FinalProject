package Factoryv2;

public abstract class DistrictFactory{
    public IDistricts choose(){
        IDistricts districts = chooseDistrict();
        districts.district();
        return districts;
    }
    protected abstract IDistricts chooseDistrict();
}
