package behavioral.observer.atm;

public class TaiKhoan implements ATM.TaiKhoanATM {
    String tenTK;
    int soDu;
    ATM atm;

    public TaiKhoan(String tenTK, int soDu, ATM atm) {
        this.tenTK = tenTK;
        this.soDu = soDu;
        this.atm = atm;
    }

    public void duaTheVaoATM(){
        atm.nhanThe(this);
    }
    public void rutTheRaATM(){
        atm.traThe(this);
    }
    @Override
    public boolean kiemTraSoDu(int soTienRut) {
        return soDu-soTienRut>=50000;
    }

    @Override
    public void nhanThongBao(int soTienRut, boolean thanhCong) {
        if(thanhCong){
            System.out.printf("\nTên tài khoản: "+this.tenTK);
            System.out.printf("\nSố dư ban đầu: "+this.soDu);
            this.soDu= this.soDu-soTienRut;
            System.out.printf("\nSố tiền rút: "+ soTienRut);
            System.out.printf("\nSố dư cuối: "+this.soDu);

        }else{
            System.out.printf("\nTên tài khoản: "+this.tenTK);
            System.out.printf("\nSố dư ban đầu: "+this.soDu);
            System.out.printf("\nSố tiền rút: "+ soTienRut);
            System.out.printf("\nKhông đủ tiền để rút: ");
        }
    }
}
