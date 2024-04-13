package structural.decorator.beverage.B2_tokenize;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LoaiBoDauCau extends TokenizeDecorator{
    public LoaiBoDauCau(Tokenize token) {
        super(token);
    }

    @Override
    public List<String> tokenize() {
        List<String> words = token.tokenize();
        words.replaceAll(s -> s.replaceAll("\\p{Punct}",""));
        return words;
    }
}
