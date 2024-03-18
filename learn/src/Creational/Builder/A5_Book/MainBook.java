package Creational.Builder.A5_Book;

public class MainBook {
    public static void main(String[] args) {
        Book book = new Book.Builder()
                .settuaDe("Đạo lý làm người")
                .settacGia("Hoàng Tuấn Kiệt")
                .setsoTrang(100)
                .addchuong("Chương 1: Cách làm người")
                .addchuong("Chương 2: Cách sống tốt")
                .addchuong("Chương 3: Kẻ tay trắng")
                .addchuong("Chương 4: Vượt lên chính mình")
                .addchuong("Chương 5: Hướng tới vinh quang")
                .build();
        System.out.println(book.toString());
    }
}
