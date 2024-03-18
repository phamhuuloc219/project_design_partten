package Creational.Builder.A7_Computer;
//1. Lớp cần tạo đối tượng, việc tạo đối tượng gồm nhiều thành phần thông qua nhiều bước
public class Computer63 {
    //2. xác định các thành phần phức tạp cần khởi tạo thông qua các bước
    String CPU,RAM,storage,screen;
    //4. viết hàm khởi tạo

    private Computer63(Builder b) {
        CPU = b.CPU;
        RAM = b.RAM;
        storage = b.storage;
        screen = b.screen;
    }

    //3. viết lớp builder
    public static class Builder{
        private String CPU,RAM,storage,screen;
        //6. các phương thức để xây dựng từng thành phần
        public Builder buildCPU(String cpu){
            this.CPU = cpu;
            return this;
        }
        public Builder buildRAM(String ram){
            this.RAM = ram;
            return this;
        }
        public Builder buildStorage(String storage){
            this.storage = storage;
            return this;
        }
        public Builder buildScreen(String screen){
            this.screen = screen;
            return this;
        }
        //5. phương thức build trả về đối tượng cần khởi
        public Computer63 build(){
            return new Computer63(this);
        }
    }

    @Override
    public String toString() {
        return "Computer63{" +
                "CPU='" + CPU + '\'' +
                ", RAM='" + RAM + '\'' +
                ", storage='" + storage + '\'' +
                ", screen='" + screen + '\'' +
                '}';
    }
}
