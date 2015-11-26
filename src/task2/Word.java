
package task2;


import java.util.List;

public class Word{
    
    private List<Symbol> symbols;
    
    public Word(String word) {
        this.symbols=TextParser.parseWord(word);
    }
   
    public List getSymbols() {
        return this.symbols;
    }
    
    @Override
    public String toString() {
        StringBuilder word=new StringBuilder();
        for(Symbol s : this.symbols) {
            word.append(s.toString());
        }
        return word.toString();
    }
    
}
