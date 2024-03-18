package structural.decorator.beverage;

public abstract class CondimentDecorator extends Beverage{
    Beverage beverage;

    public CondimentDecorator(String description, Beverage beverage) {
        super(description);
        this.beverage = beverage;
    }

    public CondimentDecorator(String description) {
        super(description);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", " +super.getDescription();
    }
}
