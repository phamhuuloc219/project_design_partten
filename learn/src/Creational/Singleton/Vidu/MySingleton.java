package Creational.Singleton.Vidu;

public class MySingleton {
    //1.Khai bao bien singleton
    private static MySingleton instance;
    //2.phuong thuc khoi tao private hoac protected
    int count =0;
    protected MySingleton() {   }
    //3. phuong thuc tinh dung de tra ve bien instance
    public static MySingleton getInstance (){
        if(instance==null){
            instance = new MySingleton();
        }
        return instance;
    }
    public void inCount(){
        System.out.println(++count);
    }
}
