/**
 * Write a description of class game here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Game  
{
    private int seconds;
    private int timeCounter;

    /**
     * Constructor for objects of class game
     */
    public Game()
    {
        seconds=0;
    }    
    
    public int getSeconds()
    {
        return seconds;
    }
    
    public void setSeconds(int value)
    {
        seconds = value;
    }
    /*public void act()
    {
        ChristmasWorld timeFromWorld = new ChristmasWorld();
        timeFromWorld.timeCounter = timeCounter;
        if(timeCounter()%36==0)
        {
            seconds++;
        }
    }
    
    public int gameTime()
    {
        
    }*/ 
}
