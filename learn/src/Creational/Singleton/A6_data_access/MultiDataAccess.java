package Creational.Singleton.A6_data_access;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;

public class MultiDataAccess {
    private static Dictionary<String, MultiDataAccess> instances = new Hashtable<>();
    List<SanPham> list = new ArrayList<>();
    public static MultiDataAccess getInstances(String tag) {
        if (instances.get(tag) == null) {
            var md = new MultiDataAccess();
            instances.put(tag, md);
        }
        return instances.get(tag);
    }
    //Các phương thức theo yêu cầu đề bài
    public void addSanPham(SanPham tag){
        for(int i=0;i< list.size();i++){
            if(list.get(i).maSanPham == tag.maSanPham){
                list.add(i,tag);
            }
        }
    }
    public void deleteSanPham(SanPham tag){
        for(int i=0;i< list.size();i++){
            if(list.get(i).maSanPham == tag.maSanPham){
                list.remove(i);
            }
        }
    }
    public void updateSanPham(SanPham tag){
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).maSanPham == tag.maSanPham) {
                list.set(i,tag);
                return;
            }
        }
    }
}