class IDCard extends Card
{
    private String idNumber;
    
    public boolean equals( Object other )
    {
        // check if this object and the other object are both instances of the same class
        if( this.getClass() == other.getClass())
        {
            // since both objects are instances of IDCard, it is okay to cast other to an IDCard reference
            IDCard otherIDCard = (IDCard) other;
            
            boolean isEqual = super.equals( otherIDCard );
            return isEqual && idNumber.equals( otherIDCard.idNumber ));
        }
        
        return false;
    }
}