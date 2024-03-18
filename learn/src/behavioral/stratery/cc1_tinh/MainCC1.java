package behavioral.stratery.cc1_tinh;

public class MainCC1 {
    public static void main(String[] args) {
        context c=new context();
        float kq1=c.setTinhToan(new Cong()).Tinh(6,4);
        System.out.println("Ket qua phep cong: "+kq1);
        float kq2=c.setTinhToan(new Tru()).Tinh(6,4);
        System.out.println("Ket qua phep tru: "+kq2);
        float kq3=c.setTinhToan(new Nhan()).Tinh(6,4);
        System.out.println("Ket qua phep nhan: "+kq3);
        float kq4=c.setTinhToan(new Chia()).Tinh(6,4);
        System.out.println("Ket qua phep chia: "+kq4);
    }
}
