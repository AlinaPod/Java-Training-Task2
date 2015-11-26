
package task2;


import java.util.List;
import java.util.regex.Pattern;

public class Sentence{
    
    private List<Word> words;

    public Sentence(String sentence){
        this.words=TextParser.parseSentence(sentence);
    }

    public List<Word> getWords() {
        return this.words;
    }
    
    @Override
    public String toString() {
        StringBuilder sentence=new StringBuilder();
        
        for(Word part : this.words) {
            if(!Pattern.matches("[.?!/,:;]", part.toString())){
                sentence.append(" ");
            }
            sentence.append(part.toString());
        }
        
        sentence.deleteCharAt(0);
        return sentence.toString();
    }
   
    public boolean contains(Word element){
        boolean flag=true;
        for (Word w: this.words){
            if(w.toString().contains(element.toString())){
                flag=true;
                break;
            }
            else{
                flag=false;
            }          
        
        }
        return flag;
    }        
}
