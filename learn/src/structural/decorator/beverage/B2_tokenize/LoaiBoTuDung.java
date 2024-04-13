package structural.decorator.beverage.B2_tokenize;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LoaiBoTuDung extends TokenizeDecorator{
    private ArrayList<String> stopWord;
    public LoaiBoTuDung(Tokenize token) {
        super(token);
        stopWord = new ArrayList<String>(Arrays.asList("và","thì","hoặc","mà","là","nhưng"));
    }

    @Override
    public List<String> tokenize() {
        List<String> words = token.tokenize();
        words.removeAll(stopWord);
        return words;
    }
}