package behavioral.observer.CA4;

import java.util.ArrayList;
import java.util.List;

public class MainTopic {
    public static void main(String[] args) {
        Topic topic = new Topic();

        ThanhVienA tvA = new ThanhVienA();
        topic.dangKy(tvA);

        List<String> tinTucBD = new ArrayList<>();
        tinTucBD.add("Tin 1: ");
        tinTucBD.add("Tin 2: ");
        tinTucBD.add("Tin 3: ");

        ThanhVienB tvB = new ThanhVienB(tinTucBD);
        topic.dangKy(tvB);

        topic.themMoi("Chào các bạn");
        topic.themMoi("chào mừng đến với NTU");
        topic.themMoi("Chuẩn bị vào tham quan trương");

        topic.capNhat(1, "Đã mở cổng");
    }
}
