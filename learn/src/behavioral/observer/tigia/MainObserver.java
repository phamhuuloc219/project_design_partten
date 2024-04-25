package behavioral.observer.tigia;

public class MainObserver {
    public static void main(String[] args) {
        TiGia t = new TiGia();
        NhaDauTuA a = new NhaDauTuA(t);
        NhaDauTuB b = new NhaDauTuB(t);
        a.dangKy();
        b.dangKy();
        System.out.println("Lần 1");
        t.capNhatTiGia(1);
        System.out.println("Lần 2");
        t.capNhatTiGia(-1);
        b.huyDangKy();
        System.out.println("Lần 3");
        t.capNhatTiGia(2);
    }
}
