package Creational.Factory;

public class MainPizza {
    public static void main(String[] args) {
        PizzaStore store = new VN_PizzaStore();
        PizzaStore store1 = new VN_PizzaStore();
        Pizza pizza = store.orderPizza(PizzaType.HAISAN);
        Pizza pizza1 = store1.orderPizza(PizzaType.CHUOT_DONG);
        System.out.println(pizza.toString());
        System.out.println(pizza1.toString());
    }
}
