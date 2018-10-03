public class Time4
{
    private int totalSeconds;
    
    public Time4 (int h, int m, int s)
    { 
        totalSeconds = s + 60 * m + 3600 * h;
    }
    public Time4 (int h, int m)
    {
        totalSeconds = m * 60 + h * 3600;
    }
    public Time4 (int totalSec)
    {
        totalSeconds = totalSec;
    }
    
    public int getHours()
    { 
        return totalSeconds/3600;
    }
    
    public int getMins()
    {
        return (totalSeconds%3600)/60;
    }
    
    public int getSecs()
    {
        return totalSeconds - (getHours()*3600) - (getMins()*60) ;
    }
    
    public int getTotalSecs()
    {
        return totalSeconds;
    }
    
    public String toString()
    {
    String ans = "the time is " + getHours() + " hours, " + getMins() + " minutes, and " + getSecs() + " seconds.";
    return ans;
}
}
    
    