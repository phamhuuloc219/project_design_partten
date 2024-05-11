package structural.decorator.computer;

public class MainComputer {
    public static void main(String[] args) {
        ConcretePC pc1 = new ConcretePC("h550","intel cpre i5", "8GB","256GB","14Inch",550,1950,8,256,14);
        System.out.printf(pc1.build());
        System.out.printf("Nâng cấp PC\n");
        UpgradeCPU cpu =  new UpgradeCPU(pc1,"intel core i7", 7);
        System.out.printf(cpu.build());
    }
}