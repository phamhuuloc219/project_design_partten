package structural.decorator.computer;

public class ConcretePC extends PC{
    public ConcretePC(String mainboard, String cpu, String ram, String storage, String screen, int vMainboard, int vCpu, int vRam, int vStorage, int vScreen) {
        this.mainboard = mainboard;
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
        this.screen = screen;
        this.vMainboard = vMainboard;
        this.vCpu = vCpu;
        this.vRam = vRam;
        this.vStorage = vStorage;
        this.vScreen = vScreen;
    }

    @Override
    public String build() {
        StringBuilder builder = new StringBuilder();
        builder
                .append("Mainboard: "+mainboard+"\n")
                .append("CPU: "+cpu+"\n")
                .append("RAM: "+ram+"\n")
                .append("Storage: "+storage+"\n")
                .append("Screen: "+screen+"\n");
        return builder.toString();
    }

    @Override
    public int value() {
        return vMainboard+vCpu+vRam+vStorage+vScreen;
    }
}
