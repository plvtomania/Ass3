import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HalloweenWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HalloweenWorld extends GameMode
{
    
    private int health;
    private int healthDropZombie;
    
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
    
    public void act()
    {
        super.act();
        showText("" + game.getHealth(), 89, 43);
        calculateHealth();
    }
    
    public void calculateHealth()
    {
        game.setHealth(game.getHealth() + hammer.getHealthDrop() + healthDropZombie);
        hammer.setHealthDrop(0);
        healthDropZombie = 0;
            
    }
    
    public boolean checkGameOver()
    {           
        if(game.getHealth()== 0)
        {
            return true;
        }
        
        return false;
    }
    
    public void setHealthDropZombie(int value)
    {
        healthDropZombie = value;
    }
    
    public int getHealthDropZombie()
    {
        return healthDropZombie;
    }
}
