package structural.decorator.beverage;

public abstract class Beverage {
    String description;
    public Beverage(String description) {
        this.description = description;
    }
    public abstract float coast();

    public String getDescription() {
        return description;
    }
}
