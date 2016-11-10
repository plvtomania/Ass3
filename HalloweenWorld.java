import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HalloweenWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HalloweenWorld extends GameMode
{

    /**
     * Constructor for objects of class HalloweenWorld.
     * 
     */
    public HalloweenWorld()
    {    
        // calling the other constructor with gameStarted = false.
        this(false); 
    }
    
    public HalloweenWorld(boolean gameStarted)
    {
        // Create a new world with 500x450 cells with a cell size of 1x1 pixels.
        super();  
            
        if (gameStarted)
        {
            super.initialize();
            setPaintOrder(Hammer.class, Mole.class);
        }
        else
        {
            Greenfoot.setWorld(new IntroWorld());
        }
        
    }
    
    public boolean checkGameOver()
    {
        return false;
    }
}
