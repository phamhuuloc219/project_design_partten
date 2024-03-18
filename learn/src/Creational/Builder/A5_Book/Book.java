package Creational.Builder.A5_Book;

import java.util.ArrayList;
import java.util.List;

public class Book {
    String tuaDe, tacGia;
    int soTrang;
    List<String> chuong;

    public Book(String tuaDe, String tacGia, int soTrang, List<String> chuong) {
        this.tuaDe = tuaDe;
        this.tacGia = tacGia;
        this.soTrang = soTrang;
        this.chuong = chuong;
    }
    @Override
    public String toString(){
        String str = "Tiêu đề: " + tuaDe+ "\n";
        str += "Tác giả: " + tacGia + "\n";
        str += "Số Trang: " + soTrang + "\n";
        str += "Danh sách chương: " + chuong.toString();
        return str;
    }
    public static class Builder{
        String tuaDe, tacGia;
        int soTrang;
        List<String> chuong = new ArrayList<>();
        public Builder(){}
        public Builder settuaDe(String tuaDe){
            this.tuaDe = tuaDe;
            return this;
        }
        public Builder setsoTrang(int soTrang){
            this.soTrang = soTrang;
            return this;
        }
        public Builder settacGia(String tacGia){
            this.tacGia = tacGia;
            return this;
        }
        public Builder addchuong(String chuong){
            this.chuong.add(chuong);
            return this;
        }
        public Book build(){
            return new Book(tuaDe, tacGia, soTrang, chuong);
        }
    }

}
