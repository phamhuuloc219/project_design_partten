package structural.decorator.computer;

public abstract class PC {
    String mainboard, cpu, ram, storage, screen;
    int vMainboard, vCpu, vRam, vStorage, vScreen;
    abstract public String build();
    abstract public int value();

    public String getMainboard() {
        return mainboard;
    }

    public String getCpu() {
        return cpu;
    }

    public String getRam() {
        return ram;
    }

    public String getStorage() {
        return storage;
    }

    public String getScreen() {
        return screen;
    }

    public int getvMainboard() {
        return vMainboard;
    }

    public int getvCpu() {
        return vCpu;
    }

    public int getvRam() {
        return vRam;
    }

    public int getvStorage() {
        return vStorage;
    }

    public int getvScreen() {
        return vScreen;
    }
}
