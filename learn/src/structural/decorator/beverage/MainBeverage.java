package structural.decorator.beverage;

public class MainBeverage {
    public static void main(String[] args) {
        Beverage b = new HouseBlend("Cafe Trung Nguyên số 1");
                b= new Milk("Sữa cô gái Hà Lan",b);
                b= new Milk("Sữa ông Thọ",b);
        System.out.println(b.getDescription());
        System.out.println(b.coast());
    }
}
