import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mole here.
 * 
 * @authors Casper, Casper, Kasper, Meng and Deividas
 * @version (a version number or a date)
 */
public abstract class Mole extends Actor
{
    protected int expireTime;
    private int initExpireTime; 

    /**
     * Act - do whatever the Mole wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Counts up the expireTime, and if the expireTime is greater than or equal to initExpireTime, the mole is selfdestructed.
        expireTime++;
        if(expireTime >= initExpireTime)
        {
            selfDestruct();
        }
    }
    
    /**
     * Constructor for Mole.class.
     * Sets the expireTime to 0, and the current initExpireTime equal to initExpireTime.
     */
    public Mole(int initExpireTime)
    {
        expireTime = 0;
        
        this.initExpireTime = initExpireTime;
    }
    
    /**
     * Makes it possible for the moles to selfdestruct.
     */
    public void selfDestruct()
    {
        getWorld().removeObject(this);
    }
}
