/**
 * Write a description of class game here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class game  
{
    private int seconds;
    private int score;
    private int level;
    
    /**
     * Constructor for objects of class game
     */
    public game()
    {
        seconds = 0;
        level = 1;
    }
    
    public int getSeconds()
    {
        return seconds;
    }
    
    public void setSeconds(int value)
    {
        seconds = value;
    }
    
    public int getScore()
    {
        return score;
    }
    
    public void setScore(int value)
    {
        score = value;
    }
    
    public int getLevel()
    {
        return level;
    }
    
    public void setLevel(int value)
    {
        level = value;
    }
    
  
}
