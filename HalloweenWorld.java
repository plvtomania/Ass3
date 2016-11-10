import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HalloweenWorld here.
 * 
 * @authors Casper, Casper, Kasper, Meng and Deividas
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
    
    /**
     * Constructs the game.
     */
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
    
    /**
     * Makes the class act however the super class wants it to act.
     * Game health is displayed at a fixed location on the game board.
     */
    public void act()
    {
        super.act();
        showText("" + game.getHealth(), 89, 43);
        calculateHealth();
    }
    
    /**
     * Sets the current health.
     */
    public void calculateHealth()
    {
        game.setHealth(game.getHealth() + hammer.getHealthDrop() + healthDropZombie);
        hammer.setHealthDrop(0);
        healthDropZombie = 0;
            
    }
    
    /**
     * Checks whether or not the game is over.
     */
    public boolean checkGameOver()
    {           
        if(game.getHealth()== 0)
        {
            return true;
        }
        
        return false;
    }
    
    /**
     * Sets the healthDropZombie equal to value.
     */
    public void setHealthDropZombie(int value)
    {
        healthDropZombie = value;
    }
    
    /**
     * Checks the healthDropZombie's current state.
     */
    public int getHealthDropZombie()
    {
        return healthDropZombie;
    }
}
