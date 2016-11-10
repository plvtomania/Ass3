import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * Write a description of class IntroWorld here.
 * 
 * @authors Casper, Casper, Kasper, Meng and Deividas
 * @version (a version number or a date)
 */
public class IntroWorld extends World
{
    private static final int WORLD_WIDTH = 500;
    private static final int WORLD_HEIGHT = 450;
    /**
     * Constructor for objects of class IntroWorld.
     * 
     */
    public IntroWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(WORLD_WIDTH, WORLD_HEIGHT, 1); 
        GreenfootImage intro = getBackground();
        intro.setColor(Color.BLACK);
        intro.drawString("Intro world. Hit <enter> to start game...", WORLD_WIDTH / 2 - 100  , WORLD_HEIGHT / 2 - 10);
        intro.drawString("Use the cursor to whack the mole", WORLD_WIDTH / 2 - 95, WORLD_HEIGHT / 2 + 10);
    }
    
    public void act()
    {
        
        String key = Greenfoot.getKey();
        if (key != null && key.equals("enter"))
        {
            Greenfoot.setWorld(new ChristmasWorld(true));
        }
    }
}
