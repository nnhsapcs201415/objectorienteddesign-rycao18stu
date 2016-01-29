public class NumericQuestion extends Question
{
    private double answer;
    
    public void setAnswer( double correctResponse )
    {
        this.answer = correctResponse;
    }
    
    public boolean checkAnswer( String response )
    {
        double responseAsDouble = Double.parseDouble( response );
        return Math.abs( responseAsDouble - answer ) <= 0.01;
    }


}
