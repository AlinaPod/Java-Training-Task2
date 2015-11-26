package task2;

public class TaskRunner{
        
    public static void main(String[] args) {
        String test="Different characters in the book were also based on people in Keyes's life. "
                + "The character of Algernon was inspired by a university dissection class, "
                + "and the name was inspired by the poet Algernon Charles Swinburne."
                + "Nemur and Strauss, the scientists who develop the intelligence-enhancing "
                + "surgery in the story, were based on professors Keyes met while "
                + "studying psychoanalysis in graduate school.";
        
        Text text=new Text(test);
        System.out.println(text);
        System.out.println(Text.findUniqueWords(text)); 
        
    }
}