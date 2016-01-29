public class ChoiceQuestion extends Question
{
    private int numberOfChoices;
    
    public ChoiceQuestion()
    {
        super();
        numberOfChoices = 0;
    }
    
    public void addChoice( String choice, boolean correct )
    {
        numberOfChoices++;
        this.addText( "\n" + numberOfChoices + ") " + choice );
        if( correct )
        {
            String choiceString = "" + numberOfChoices;
            this.setAnswer( choiceString );
        }
    }
}
