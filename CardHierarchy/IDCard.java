public class IDCard extends Card
{
    private String idNumber;
    
    public boolean equals( IDCard otherCard )
    {
        boolean isEqual = super.equals( otherCard );
        return isEqual && this.idNumber.equals( otherCard.idNumber );
    }
}
