package structural.decorator.beverage;

public class HouseBlend extends Beverage{
    public HouseBlend(String description) {
        super(description);
    }
    @Override
    public float coast(){
        return 10;
    }
}
