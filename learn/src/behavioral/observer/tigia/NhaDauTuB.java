package behavioral.observer.tigia;

public class NhaDauTuB implements TiGiaObserver{
    TiGia t;

    public NhaDauTuB(TiGia t) {
        this.t = t;
    }
    public void dangKy(){
        t.attach(this);
    }
    public void huyDangKy(){
        t.detach(this);
    }

    @Override
    public void update(float delta) {
        if(delta >=0)
            System.out.println("Nhà đầu tư B: Mua vào");
        else
            System.out.println("Nhà đầu tư B: Bán ra");
    }
}
