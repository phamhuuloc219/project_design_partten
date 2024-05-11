package structural.decorator.computer;

public abstract class PCDecorator extends PC{
    PC pc;

    public PCDecorator(PC pc) {
        this.pc = pc;
    }

    @Override
    public String getMainboard() {
        return pc.getMainboard();
    }

    @Override
    public String getCpu() {
        return pc.getCpu();
    }

    @Override
    public String getRam() {
        return pc.getRam();
    }

    @Override
    public String getStorage() {
        return pc.getStorage();
    }

    @Override
    public String getScreen() {
        return pc.getScreen();
    }

    @Override
    public int getvMainboard() {
        return pc.getvMainboard();
    }

    @Override
    public int getvCpu() {
        return pc.getvCpu();
    }

    @Override
    public int getvRam() {
        return pc.getvRam();
    }

    @Override
    public int getvStorage() {
        return pc.getvStorage();
    }

    @Override
    public int getvScreen() {
        return pc.getvScreen();
    }
}
