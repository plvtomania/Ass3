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
    private int score;
    

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
        score = 0;
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
       
       if (Greenfoot.mouseClicked(null))
       {
           Actor actor = getOneObjectAtOffset(0, 0, Actor.class);
           if(actor!=null && actor.getClass()==Zombie.class)
           {
               Zombie zombie = (Zombie)actor;
               World world = getWorld();
               world.removeObject(actor);
               
               score = score + 1;
           }
           
           if(actor!=null && actor.getClass()==GoldenZombie.class)
           {
               GoldenZombie gZombie = (GoldenZombie)actor;
               World world = getWorld();
               world.removeObject(actor);
               
               score = score + 3;
           }
           
           if(actor!=null && actor.getClass()==Elf.class)
           {
               Elf elf = (Elf)actor;
               World world = getWorld();
               world.removeObject(actor);
               
               score = score - 2;
           }
       }
        
    }
    
    public int getScore()
    {
        return score;
    }
}

