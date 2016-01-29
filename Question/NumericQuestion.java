public class NumericQuestion extends Question
{
    private double answer;
    
    // this is an example of method overloading
    //  (the setAnswer method that takes a String is being overloaded)
    public void setAnswer( double correctResponse )
    {
        this.answer = correctResponse;
    }
    
    // this is an example of method overriding
    // (the checkAnswer method in the question class is being overridden)
    public boolean checkAnswer( String response )
    {
        double responseAsDouble = Double.parseDouble( response );
        return Math.abs( responseAsDouble - answer ) <= 0.01;
    }
}
