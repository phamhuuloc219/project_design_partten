package Creational.Factory;

public abstract class PizzaStore {
    abstract Pizza createPizza(PizzaType p);
    public Pizza orderPizza(PizzaType p){
        Pizza pizza = createPizza(p);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
