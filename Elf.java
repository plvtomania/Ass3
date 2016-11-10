import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Elf here.
 * 
 * @authors Casper, Casper, Kasper, Meng and Deividas
 * @version (a version number or a date)
 */
public class Elf extends Mole
{
    /**
     * Act - do whatever the Elf wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        super.act();
        if(expireTime >= initExpireTime)
        {
            selfDestruct();
                
        }
        
    }
    
    /**
     * Constructor for Elf.class.
     * Uses the expireTime from the super class Mole.class.
     */
    public Elf(int expireTime)
    {
       super(expireTime);
    }
}
