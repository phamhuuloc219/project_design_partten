package Creational.Singleton.A6_data_access;
public class UI {
    public void them(SanPham sp, String tag) {
        DataAccessUpgrade.getInstance(tag).them(sp);
    }
}