import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Zombie here.
 * 
 * @authors Casper, Casper, Kasper, Meng and Deividas
 * @version (a version number or a date)
 */
public class Zombie extends Mole
{
    /**
     * Act - do whatever the Zombie wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Makes it possible for the super class Mole.class to control the acts of Zombie.class.
       super.act();
       if(expireTime  >= initExpireTime)
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
     * Constructor for Zombie.class.
     */
    public Zombie(int expireTime)
    {
       super(expireTime);
           
    }
    
    /**
     * Sets the image of the class to zombie1.png.
     */
    public void createImage()
    {
         setImage("zombie1.png");
    }
}
