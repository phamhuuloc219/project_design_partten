package behavioral.stratery.cc2_tinh;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class QLSV{
    ISoSanh soSanh1;

    public QLSV setComparator(Comparator comparator) {
        this.comparator = comparator;
        return this;
    }

    Comparator<SinhVien> comparator;
    List<SinhVien> dsSV=new ArrayList<>();
    public void themSV(SinhVien sv){
        for(SinhVien s:dsSV){
            if(s.getHoTen().equals(sv.getHoTen())){
                return ;
            }
        }
        dsSV.add(sv);
    }
    public QLSV setSoSanh1(ISoSanh soSanh1) {
        this.soSanh1 = soSanh1;
        return this;
    }

    public void sapXep(){
        for(int i=0;i<dsSV.size()-1;i++)
            for(int j=i+1;j<dsSV.size();j++)
                if(soSanh1.soSanh(dsSV.get(i),dsSV.get(j))>0) {
                    SinhVien s= dsSV.get(i);
                    dsSV.set(i, dsSV.get(j));
                    dsSV.set(j,s);
                }
    }
    public void sapXep2(){
        dsSV.sort((o1, o2) -> soSanh1.soSanh(o1, o2));
    }
    public void sapXep3(){
        dsSV.sort((comparator));
    }
    public void inDS(){
        for(SinhVien s: dsSV)
            System.out.println(s.toString());
    }
}
