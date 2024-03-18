package behavioral.template_method.cafein_beverage;

public class Coffee extends CaffeineBeverage{
    @Override
    protected void brew() {
        System.out.println("Cho bột coffee vào nước sôi và khuấy đều cho tan");
    }

    @Override
    protected void addCondiment() {
        System.out.println("Cho thêm một ít sữa ông Thọ. Chúc uống ngon, nhớ trả tiền");
    }
}
