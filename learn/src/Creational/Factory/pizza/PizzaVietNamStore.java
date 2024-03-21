package Creational.Factory.pizza;

public class PizzaVietNamStore extends PizzaStore {
    @Override
    protected Pizza createPizza(PizzaType t) {
        if (t == PizzaType.MamTom){
            return new PizzaVietNamMamTom();
        }
        if (t == PizzaType.MamNem){
           return new PizzaVietNamMamNem();
        }
        return null;
    }
}
