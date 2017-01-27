public class ComboLock
{
    private int secret1, secret2, secret3, currentNum;
    private boolean cracked1, cracked2, cracked3;
    public ComboLock( int secret1, int secret2, int secret3 )
    {
        this.secret1 = secret1;
        this.secret2 = secret2;
        this.secret3 = secret3;
        this.currentNum = 0;
        this.cracked1 = false;
        this.cracked2 = false;
        this.cracked3 = false;
    }

    public void reset()
    {
        this.currentNum = 0;
    }
    
    public void printNum()
    {
        System.out.println("Current Number the Dial is at: " + this.currentNum);
    }

    public void turnLeft( int ticks )
    {
        this.currentNum -= ticks;
        while (this.currentNum <= 0)
        {
            this.currentNum += 40;
        }
        while (this.currentNum >= 40)
        {
            this.currentNum -= 40;
        }
        if (this.currentNum == this.secret2)
        {
            this.cracked2 = true;
        }
    }

    public void turnRight( int ticks )
    {
        this.currentNum += ticks;
        while (this.currentNum <= 0)
        {
            this.currentNum += 40;
        }
        while (this.currentNum >= 40)
        {
            this.currentNum -= 40;
        }
        if (this.cracked1)
        {
            if (this.currentNum == this.secret3)
            {
                this.cracked3 = true;
            }
        } else if (this.currentNum == this.secret1)
        {
            this.cracked1 = true;
        } else
        {
            this.cracked1 = false;
        }
    }

    public boolean open()
    {
        if (this.cracked1 && this.cracked2 && this.cracked3) return true;
        return false;
    }
}