package structural.decorator.beverage;

public class Milk extends CondimentDecorator{
    public Milk(String description, Beverage beverage) {
        super(description, beverage);
    }

    @Override
    public float coast() {
        return 2 + beverage.coast();
    }
}
