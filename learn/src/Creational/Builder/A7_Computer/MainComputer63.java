package Creational.Builder.A7_Computer;

public class MainComputer63 {
    public static void main(String[] args){
        Computer63 computer = new Computer63.Builder()
                .buildCPU("Intel 1500 ultra")
                .buildRAM("64GB")
                .buildStorage("4TB NVMe Samsung")
                .buildScreen("17 Inches LG ")
                .build();
        System.out.println(computer.toString());
    }
}
