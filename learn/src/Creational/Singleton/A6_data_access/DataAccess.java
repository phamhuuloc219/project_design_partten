package Creational.Singleton.A6_data_access;

import java.util.ArrayList;
import java.util.List;

public class DataAccess {
    // Singleton
    private static DataAccess instance;

    protected DataAccess() {
    }
    public static DataAccess getInstance() {
        if(instance==null){
            instance = new DataAccess();
        }
        return instance;
    }
    //
    List<SanPham> list = new ArrayList<>();
    public void addSanPham(SanPham s){
        for(int i=0;i< list.size();i++){
            if(list.get(i).maSanPham == s.maSanPham){
                list.add(i,s);
            }
        }
    }
    public void deleteSanPham(SanPham s){
        for(int i=0;i< list.size();i++){
            if(list.get(i).maSanPham == s.maSanPham){
                list.remove(i);
            }
        }
    }
    public void updateSanPham(SanPham s){
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).maSanPham == s.maSanPham) {
                list.set(i,s);
                return;
            }
        }
    }
}