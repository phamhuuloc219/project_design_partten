package behavioral.template_method.cafein_beverage;

public abstract class CaffeineBeverage {
    protected abstract void brew();
    protected abstract void addCondiment();
    private void boilWater(){
        System.out.println("Đun sôi nước ở 100 độ C");

    }
    private void pourInCup(){
        System.out.println("Rót thức uống ra cốc");
    }
    void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        addCondiment();
    }
}
