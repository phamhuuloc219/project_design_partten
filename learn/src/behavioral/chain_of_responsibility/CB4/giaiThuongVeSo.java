package behavioral.chain_of_responsibility.CB4;

public abstract class giaiThuongVeSo {

    String  tenGiai;
    abstract giaiThuongVeSo giaiThuongKeTiep(giaiThuongVeSo keTiep);
    abstract String doVe(String so);

    public giaiThuongVeSo(String tenGiai) {
        this.tenGiai = tenGiai;
    }
}
