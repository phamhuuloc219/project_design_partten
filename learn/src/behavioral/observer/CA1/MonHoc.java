package behavioral.observer.CA1;

public class MonHoc {
    String id, ten;
    int soTC;

    public MonHoc(String id, String ten, int soTC) {
        this.id = id;
        this.ten = ten;
        this.soTC = soTC;
    }

    @Override
    public String toString() {
        return "\nMonHoc{" +
                "id='" + id + '\'' +
                ", ten='" + ten + '\'' +
                ", soTC=" + soTC +
                '}';
    }
}
