package structural.decorator.computer;

public class UpgradeRAM extends PCDecorator{
    String nRam;
    int nvRam;

    public UpgradeRAM(PC pc, String nRam, int nvRam) {
        super(pc);
        this.nRam = nRam;
        this.nvRam = nvRam;
    }

    @Override
    public String build() {
        StringBuilder builder = new StringBuilder();
        builder.append(pc.build());
        builder.append("Nâng cấp RAM: ").append(nRam).append("\n");
        return builder.toString();
    }

    @Override
    public int value() {
        return pc.value()+ nvRam;
    }

    @Override
    public String getRam() {
        return super.getRam()+" "+nvRam;
    }

    @Override
    public int getvRam() {
        return nvRam;
    }
}
