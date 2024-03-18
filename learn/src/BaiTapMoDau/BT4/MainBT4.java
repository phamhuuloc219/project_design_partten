package BaiTapMoDau.BT4;

public class MainBT4 {
    public static void main(String[] args){

        QuanLyChuyenXe quanLy= new QuanLyChuyenXe();
        ChuyenXeNgoaiThanh ngoaiThanh1 = new ChuyenXeNgoaiThanh("3241","Loc","7914",5000000,"Nha Trang",2);
        ChuyenXeNgoaiThanh ngoaiThanh2 = new ChuyenXeNgoaiThanh("3242","Loc","7915",5000000,"Nha Trang",2);
        ChuyenXeNgoaiThanh ngoaiThanh3 = new ChuyenXeNgoaiThanh("3243","Loc","7916",5000000,"Nha Trang",2);
        ChuyenXeNoiThanh noiThanh1= new ChuyenXeNoiThanh("1234","Loc","4321",5000000,5,40);
        ChuyenXeNoiThanh noiThanh2= new ChuyenXeNoiThanh("1234","Loc","6345",5000000,7,34);
        ChuyenXeNoiThanh noiThanh3= new ChuyenXeNoiThanh("1234","Loc","6345",5000000,6,32);
        quanLy.Them(noiThanh1);
        quanLy.Them(noiThanh2);
        quanLy.Them(noiThanh3);
        quanLy.Them(ngoaiThanh1);
        quanLy.Them(ngoaiThanh2);
        quanLy.Them(ngoaiThanh3);

        System.out.println("Thông tin của từng chuyến xe: ");
        quanLy.inDS();
        System.out.println("Tổng doanh thu: ");
        quanLy.tinhDoanhThuXeNgoaiThanh();

    }

}
