import java.util.Scanner;

/**
 * Write a description of class FillInQuestion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FillInQuestion extends Question
{
    /**
     * This is another example of overriding a method and demonstrates
     * how the super reserved word can be used to call methods in the
     * parent class
     * 
     * Sets the question text
     * 
     * @param questionText the text of this question
     */
    public void setText(String questionText)
    {
        Scanner parser = new Scanner(questionText);
        parser.useDelimiter("_");
        String question = parser.next();
        String answer = parser.next();
        question += "_____" + parser.next();
        
        //call the superclass version of setText (cannot directly
        // change text)
        super.setText(question);
        
        // call the superclass version of setAnswer (cannot directly
        //change answer)
        super.setAnswer(answer);
    }
}
