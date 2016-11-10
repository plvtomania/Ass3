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
    }
    
    public void act()
    {
    }
    
    /**
     * Creates buttons for ChristmasWorld and HalloweenWorld,
     * so the player can choose which version, he/she wants to play.
     */
    private void createButtons()
    {
        GreenfootImage christmasButton = new GreenfootImage("ChristmasWorldButton.jpg");
        GreenfootImage halloweenButton = new GreenfootImage("HalloweenWorldButton.jpg");
        
        addObject(new Button(2,christmasButton), 359,323);
        addObject(new Button(3,halloweenButton), 138,323);
    }
}
