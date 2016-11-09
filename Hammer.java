import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class hammer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hammer extends Actor
{
    private GreenfootImage image1;
    private GreenfootImage image2;
    private int actCount;

    /**
     * Act - do whatever the hammer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        mouse();
        switchImage();
        removeOnClick();
    }    
    
    public Hammer()
    {
        image1 = new GreenfootImage("candycane.png");
        image2 = new GreenfootImage("candycaneblood.png");
        setImage(image1);
    }
    
    public void mouse()
    {
       /*
       if(!Greenfoot.mouseMoved(null))
       {
            MouseInfo mouse = Greenfoot.getMouseInfo();
            setLocation(mouse.getX(),mouse.getY());
       }
       */
      if(Greenfoot.mouseMoved(null))
      {
            MouseInfo mouse = Greenfoot.getMouseInfo();
            setLocation(mouse.getX(),mouse.getY());
      }
       
      /*
      MouseInfo mouse = Greenfoot.getMouseInfo();
      setLocation(mouse.getX(),mouse.getY());
      */
    }
   
    public void switchImage()
    {
        if(Greenfoot.mousePressed(null))
        {    
            setImage (image2);
        }
        else
        {
            
            if (actCount > 40)
            {
                setImage (image1);
                actCount = 0;
            }
            actCount++;
        }
    }
    
    public void removeOnClick()
    {
        if (Greenfoot.mouseClicked(null)&& !getIntersectingObjects(Mole.class).isEmpty())
        {
            World world;
            world = getWorld();
            
            Actor mole = getOneObjectAtOffset(0, 0, Mole.class);
            
           
            world.removeObject(mole);
            return;
        }    
    }
}

