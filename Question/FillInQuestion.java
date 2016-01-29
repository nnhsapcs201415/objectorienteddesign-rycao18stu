import java.util.Scanner;

/* This class supports a fill-in-the-blank question where the answer is specified in the
 *  question's text delimited by '_'. This class extracts the answer from the question's text
 *  and stores the text and answer accordingly.
 */

public class FillInQuestion extends Question
{
    /* Extracts he answer from the specified question text. For example:
     *  "The inventor of Java was _James Gosling_."
     *  
     *  text: "The inventor of Java was ________."
     *  answer: "James Gosling"
     */
    public void setText( String questionText )
    {
        Scanner parser = new Scanner( questionText );
        parser.useDelimiter( "_" );
        String question = parser.next();
        String answer = parser.next();
        question += "________" + parser.next();
        
        super.setText( question );
        this.setAnswer( answer );
    }
}
