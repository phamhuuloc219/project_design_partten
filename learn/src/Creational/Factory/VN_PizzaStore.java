package Creational.Factory;

public class VN_PizzaStore extends PizzaStore{
    @Override
    Pizza createPizza(PizzaType p) {
        switch (p) {
            case HAISAN -> {
                new VN_HaiSanPizza();
            }
        }
        return null;
    }
}
