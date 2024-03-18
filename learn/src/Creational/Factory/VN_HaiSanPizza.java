package Creational.Factory;

public class VN_HaiSanPizza extends Pizza{
    @Override
    void prepare() {
        builder.append("Bột gạo và 4 con cá cơm");
    }

    @Override
    void bake() {
        builder.append("\n").append("Nướng trong lò");
    }

    @Override
    void cut() {

    }

    @Override
    void box() {

    }
}
