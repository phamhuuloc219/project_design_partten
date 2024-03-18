package structural.composite.B3;

import java.util.ArrayList;
import java.util.List;

public class Folder extends AbstractFile{
    List<AbstractFile> children = new ArrayList<>();
    public Folder(String ten, String ngayTao) {
        super(ten, ngayTao);
    }

    @Override
    public void add(AbstractFile f) {
        children.add(f);
        f.duongDan = this.duongDan + "\\" + f.duongDan;
    }

    @Override
    public void remove(AbstractFile f) {
        children.remove(f);
    }

    @Override
    public String getStringTreeFolder() {
        StringBuilder sb = new StringBuilder(ten + "\n");
        for (AbstractFile f : children) {
            sb.append("  ").append(f.getStringTreeFolder());
        }
        return sb.toString();
    }
}
