import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class hammer here.
 * 
 * @authors Casper, Casper, Kasper, Meng and Deividas
 * @version (a version number or a date)
 */
public class Hammer extends Actor
{
    private GreenfootImage image1;
    private GreenfootImage image2;
    private int actCount;
    private int score;
    private int healthDrop;
    private GreenfootSound goodMole;
    private GreenfootSound badMole;
    

    /**
     * Act - do whatever the hammer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Calls the mouse, switchImage and removeOnClick methods.
        mouse();
        switchImage();
        removeOnClick();
        goodMole = new GreenfootSound("GoodMole.wav");
        badMole = new GreenfootSound("BadMole.wav");
    }    
    
    /**
     * Creates a hammer with score and an image.
     */
    public Hammer()
    {
        score = 0;
        healthDrop = 0;
        image1 = new GreenfootImage("candycane.png");
        image2 = new GreenfootImage("candycaneblood.png");
        setImage(image1);
    }
    
    /**
     * Detects mouse movement.
     */
    public void mouse()
    {
      if(Greenfoot.mouseMoved(null))
      {
            MouseInfo mouse = Greenfoot.getMouseInfo();
            setLocation(mouse.getX(),mouse.getY());
      }
    }
    
    /**
     * Changes the image of the candy cane, when a certain actCount number is met.
     */
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
    
    /**
     * When a Zombie, GoldenZombie or Elf is clicked, the clicked actor is removed from the game.
     */
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
               goodMole.play();
               
               score = score + 1;
           }
           
           if(actor!=null && actor.getClass()==GoldenZombie.class)
           {
               GoldenZombie gZombie = (GoldenZombie)actor;
               World world = getWorld();
               world.removeObject(actor);
               goodMole.play();
               
               score = score + 3;
           }
           
           if(actor!=null && actor.getClass()==Elf.class)
           {
               Elf elf = (Elf)actor;
               World world = getWorld();
               world.removeObject(actor);
               badMole.play();
               
               score = score - 2;
               
               if(world instanceof HalloweenWorld)
               {
                   healthDrop = healthDrop - 1;
               }
               
           }
       }
        
    }
    /**
     * Gets the current score in the game.
     */
    public int getScore()
    {
        return score;
    }
    
    public int getHealthDrop()
    {
        return healthDrop;
    }
    
    public void setHealthDrop(int value)
    {
        healthDrop = value;
    }
}

