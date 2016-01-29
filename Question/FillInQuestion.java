import java.util.Scanner;

public class FillInQuestion extends Question
{
    // override the setText method to extract the answer from the quesiton text
    /* For example, given:
     *      "The inventor of Java was _James Gosling_."
     *      
     *      text: "The inventor of Java was ______"
     *      answer: "James Gosling"
     */
    public void setText( String questionText )
    {
        Scanner parser = new Scanner( questionText );
        parser.useDelimiter( "_" );
        String question = parser.next();
        String answer = parser.next();
        question += "______" + parser.next();
        
        // we have to explicitly state that we want to invoke the superclass' setText method
        super.setText( question );
        
        // we don't have to specify anything before setAnswer, but we could specify this or super
        this.setAnswer( answer );
    }
    
}
