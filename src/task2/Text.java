
package task2;

import java.util.List;
import java.util.ArrayList;

public class Text{
    
    private List<Sentence> sentences;
    
    public Text(String text) {
        this.sentences=TextParser.parseText(text);
    }
    
    public List<Sentence> getSentences(){
        return this.sentences;
    }
    
           
    public static List<Word> findUniqueWords(Text text){
        
        Sentence firstSentence=text.getSentences().get(0);  
        List<Word> uniqueWords=new ArrayList<>();
          
        for(Sentence sentence : text.getSentences()){
           if((!sentence.equals(firstSentence))){ 
              for(Word word: firstSentence.getWords()){  
                  if(!sentence.contains(word)){                  
                        uniqueWords.add(word);
                  }
                            
              }
           }
        } 
        return uniqueWords;
    }
        
    
    @Override
    public String toString(){
        StringBuilder result = new StringBuilder();
        for(Sentence sentence:this.sentences) {
            result.append(sentence.toString());
            result.append(" ");
        }
        
        result.deleteCharAt(result.length()-1);
        return result.toString();
    }     
}
