package task2;

import java.util.List;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class TextParser {
    
    public static List<Sentence> parseText(String text){
        
        List<Sentence> divided = new ArrayList();
        String cleanText=text.replaceAll("\\s{1,}", " ");
        String[] sentences=cleanText.split("(?<=[.?!])\\s+(?=[a-zA-Z])");
        
        for(String sentence:sentences){
            divided.add(new Sentence(sentence));
        }
        return divided;
    }
    
    public static List<Word> parseSentence(String sentence) {
        List<Word> divided= new ArrayList();
        
        String[] parts=sentence.split(" ");
        for(String part:parts) {
            
            int length=part.length();
           
            if(!checkForSyntax(Character.toString(part.charAt(length-1)))) {
                divided.add(new Word(part));
            }
            
            else if(length<=1){
                divided.add(new Word(part.substring(0)));
            }
            
            else {
                
                int lastSyntax=length-1;
                while(lastSyntax>=0){
                    if(checkForSyntax(Character.toString(part.charAt(lastSyntax)))){
                        lastSyntax--;
                    }
                    else{ 
                        break;
                    }
                }
                
                divided.add(new Word(part.substring(0,lastSyntax+1)));
                
                for(int index=lastSyntax+1;index<length; index++) {
                    divided.add(new Word(part.substring(index)));
                }
            }
        }
        return divided;
    }
    
    public static List<Symbol> parseWord(String word) {
        List<Symbol> divided=new ArrayList();
        for(char symbol: word.toCharArray()){
            divided.add(new Symbol(symbol));
        }
        return divided;
    }
    
    public static boolean checkForSyntax(String s) {
        return Pattern.matches("[\\p{Punct}\\s]+", s);
    }

      
}
