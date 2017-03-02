import java.util.ArrayList;

/**
A question with multiple choices.
 */
public class ChoiceQuestion extends Question
{
    private int numChoices;
    /**
    Constructs a choice question with no choices.
     */
    public ChoiceQuestion()
    {
        /*
         * Java will automatically call the Question class's default
         *  constructor before executing the next line of code
         */
        this.numChoices = 0;
    }
    
    public ChoiceQuestion(String questionText)
    {
        /*
         * Explicitly call the Question class's constructor that takes
         * a questionText parameter
         *  Calling a superclass's constructor must be the first line
         *  of code in the subclass's constructor
         */
        super(questionText);
        this.numChoices = 0;
    }

    /**
    Adds an answer choice to this question.
    @param choice the choice to add
    @param correct true if this is the correct choice, false otherwise
     */
    public void addChoice(String choice, boolean correct)
    {
        this.numChoices++;
        addText("\n" + numChoices + ")" + choice);
        if (correct)
        {
            String choiceString = "" + numChoices;
            setAnswer(choiceString);
        }
    }
    
    public String toString()
    {
        /*
         * The Question class's implementation of the toString
         * method returns a string containing the text and the answer
         * 
         * Call the superclass's toString method first and then
         * concatenate this class's instance variables
         */
        String s = super.toString();
        return s + " Number of Choices: " + numChoices;
    }
}

