package OnTapCuoiKi.Observer.CA4;

import java.util.ArrayList;
import java.util.List;

public class MainCA4 {
    public static void main(String[] args) {
        Topic topic = new Topic();
        ThanhVienA tvA = new ThanhVienA();
        topic.dangKy(tvA);

        List<String> dst = new ArrayList<>();
        ThanhVienB tvB = new ThanhVienB(dst);
        topic.dangKy(tvB);


        topic.themMoi("hello");
        topic.themMoi("hello 2");

    }
}
