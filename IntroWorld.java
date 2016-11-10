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
        super(WORLD_WIDTH, WORLD_HEIGHT, 1); 
        createButtons();
        /*GreenfootImage intro = getBackground();
        intro.setColor(Color.BLACK);
        intro.drawString("Intro world. Hit <enter> to start game...", WORLD_WIDTH / 2 - 100  , WORLD_HEIGHT / 2 - 10);
        intro.drawString("Use the cursor to whack the mole", WORLD_WIDTH / 2 - 95, WORLD_HEIGHT / 2 + 10);*/
    }
    
    public void act()
    {
        /* Makes it possible to press enter to enter the game.
        String key = Greenfoot.getKey();
        if (key != null && key.equals("enter"))
        {
            Greenfoot.setWorld(new ChristmasWorld(true));
        }
        if (key != null && key.equals("space"))
        {
            Greenfoot.setWorld(new HalloweenWorld(true));
        }*/
    }
    
    private void createButtons()
    {
        GreenfootImage christmasButton = new GreenfootImage("ChristmasWorldButton.jpg");
        GreenfootImage halloweenButton = new GreenfootImage("HalloweenWorldButton.jpg");
        
        addObject(new Button(2,christmasButton), 359,323);
        addObject(new Button(3,halloweenButton), 138,323);
    }
}
