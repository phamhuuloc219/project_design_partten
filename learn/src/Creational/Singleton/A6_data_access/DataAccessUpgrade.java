package Creational.Singleton.A6_data_access;

import java.util.Dictionary;
import java.util.Hashtable;

public class DataAccessUpgrade {
    private static Dictionary<String, DataAccessUpgrade> instance = new Hashtable();
    private DataAccessUpgrade() {

    }
    public static DataAccessUpgrade getInstance(String tag) {
        if (instance.get(tag) == null) {
            instance.put(tag, new DataAccessUpgrade());
        }
        return instance.get(tag);
    }
    public void them(SanPham sp) {

    }
}