/**
 * Write a description of class game here.
 * 
 * @authors Casper, Casper, Kasper, Meng and Deividas
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
    
    /**
     * Gets the number of seconds passed.
     */
    public int getSeconds()
    {
        return seconds;
    }
    
    /**
     * Sets the number of seconds passed.
     */
    public void setSeconds(int value)
    {
        seconds = value;
    }
    
    /**
     * Gets the current score.
     */
    public int getScore()
    {
        return score;
    }
    
    /**
     * Sets the current score.
     */
    public void setScore(int value)
    {
        score = value;
    }
    
    /**
     * Gets the live game level.
     */
    public int getLevel()
    {
        return level;
    }
    
    /**
     * Sets the live game level.
     */
    public void setLevel(int value)
    {
        level = value;
    }
    
  
}
