package structural.decorator.beverage.B2_tokenize;

public abstract class TokenizeDecorator implements Tokenize {
    protected Tokenize token;

    public TokenizeDecorator(Tokenize token) {
        this.token = token;
    }
}
