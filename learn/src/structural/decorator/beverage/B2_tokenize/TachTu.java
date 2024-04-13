package structural.decorator.beverage.B2_tokenize;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TachTu implements Tokenize {
    private String s;

    public TachTu(String s) {
        this.s = s;
    }

    @Override
    public List<String> tokenize() {
        String[] tokens = s.toLowerCase().split(" ");
        return new ArrayList<>(Arrays.asList(tokens));
    }
}
