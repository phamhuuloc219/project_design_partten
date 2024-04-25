package behavioral.observer.atm;

public class ATM {
    TaiKhoanATM theATM;
    public void nhanThe(TaiKhoanATM atm){
        this.theATM = atm;
    }
    public void traThe(TaiKhoanATM atm){
        this.theATM = null;
    }
    public void rutTien(int soTien){
        if(theATM!=null){
            if(theATM.kiemTraSoDu(soTien)==true){
                theATM.nhanThongBao(soTien,true);
            }
            else{
                theATM.nhanThongBao(soTien,false);
            }
        }else{
            System.out.printf("Không có thẻ trong máy !!!");
        }
    }
    public interface TaiKhoanATM{
        boolean kiemTraSoDu(int soTien);
        void nhanThongBao(int soTienRut, boolean thanhCong);
    }
}
