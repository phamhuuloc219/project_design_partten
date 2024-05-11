package structural.decorator.computer;

public class UpgradeCPU extends PCDecorator{
    String nCPU;
    int nvCPU;

    public UpgradeCPU(PC pc, String nCPU, int nvCPU) {
        super(pc);
        this.nCPU = nCPU;
        this.nvCPU = nvCPU;
    }

    @Override
    public String build() {
        StringBuilder builder = new StringBuilder();
        builder.append(pc.build());
        builder.append("Nâng cấp CPU: ").append(nCPU).append("\n");
        return builder.toString();
    }

    @Override
    public int value() {
        return pc.value() - super.getvCpu() + nvCPU;
    }

    @Override
    public String getCpu() {
        return nCPU;
    }

    @Override
    public int getvCpu() {
        return nvCPU;
    }
}
