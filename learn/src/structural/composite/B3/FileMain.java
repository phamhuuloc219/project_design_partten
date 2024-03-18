package structural.composite.B3;

public class FileMain {
    public static void main(String[] args) {
        Folder PHL = new Folder("PHL","2024-03-10");
        File file1 = new File("file1.txt","2024-03-11");
        File file2 = new File("file2.txt","2024-03-14");
        Folder subfolder = new Folder("subfolder", "2023-11-17");

        PHL.add(file1);
        PHL.add(file2);
        PHL.add(subfolder);

        subfolder.add(new File("file3.txt", "2023-11-18"));

        System.out.println(PHL.getStringTreeFolder());
        PHL.remove(subfolder);
        System.out.println(PHL.getStringTreeFolder());

    }
}
