package structural.decorator.beverage.B2_tokenize;

public class MainTokenize {
    public static void main(String[] args) {
        String s="Hôm nay, thứ 7 nhưng tôi phải đi học";
        Tokenize t = new TachTu(s);
        System.out.println(t.tokenize());
        t = new LoaiBoTuDung(t);
        System.out.println(t.tokenize());
        t = new LoaiBoDauCau(t);
        System.out.println(t.tokenize());
    }
}
