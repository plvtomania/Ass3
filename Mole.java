import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mole here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Mole extends Actor
{
    protected int expireTime;

    /**
     * Act - do whatever the Mole wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        expireTime++;
        if(expireTime >= 100)
        {
            selfDestruct();
        }
        //removeOnClick();
    }
    
    public Mole()
    {
        expireTime = 0;
        /*if (Greenfoot.mouseClicked(null) && !getIntersectingObjects(Hammer.class).isEmpty())
        {    
            removeOnClick();
        }*/
    
    }
    
    /**
     *The moles selfdestruct when the
     * 
     */
    public void selfDestruct()
    {
        getWorld().removeObject(this);
    }
    /*
    public void removeOnClick()
    {
        if (Greenfoot.mouseClicked(null)&& !getIntersectingObjects(Hammer.class).isEmpty())
        {
            World world;
            world = getWorld();
            
            world.removeObject(this);
            return;
        }    
    }*/
}
