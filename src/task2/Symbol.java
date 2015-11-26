
package task2;

public class Symbol{
    
    private char symbol;
    
    public Symbol(char symbol) {
        this.symbol=symbol;
    }
    
    public char getSymbol() {
        return this.symbol;
    }
    
    @Override
    public String toString() {
        return Character.toString(this.symbol);
    }
    
}
