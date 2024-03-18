package behavioral.template_method.cafein_beverage;

public class MainCaffeine {
    public static void main(String[] args){
        CaffeineBeverage cafe = new Coffee();
        cafe.prepareRecipe();
    }
}
