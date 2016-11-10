import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GoldenZombie here.
 * 
 * @authors Casper, Casper, Kasper, Meng and Deividas 
 * @version (a version number or a date)
 */
public class GoldenZombie extends Mole
{
    /**
     * Act - do whatever the GoldenZombie wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        super.act();
        if(expireTime >= initExpireTime)
        {
            if(getWorld() instanceof HalloweenWorld)
            {
                HalloweenWorld halloweenWorld = (HalloweenWorld) getWorld();
                
                halloweenWorld.setHealthDropZombie(halloweenWorld.getHealthDropZombie()-1);
                
            }
            selfDestruct();
        }
    }  
    
    /**
     * Constructor for GoldenZombie.class.
     */
    public GoldenZombie(int expireTime)
    {
       super(expireTime);
    }
}
