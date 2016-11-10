import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class Button here.
 * 
 * @authors Casper, Casper, Kasper, Meng and Deividas
 * @version (a version number or a date)
 */
public class Button extends Actor
{
    private int input;
    private int y;
    private GreenfootImage image;
    
    /**
     * Act - do whatever the Button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        //getWorld().showText("" +  x, y);
        
        if(Greenfoot.mouseClicked(this))
        {
            function(input);
        }
    }
    
    /**
     * Constructor of the button class. Sets current input equal to input,
     * and current image equal to image.
     */
    public Button(int input, GreenfootImage image)
    {
        this.input = input;
        this.image = image;
        
        createImage();
    }
    
    /**
     * A method to make it possible to switch between worlds.
     */
    public void function(int value)
    {
        switch(input)
        {
           case 1: Greenfoot.setWorld(new IntroWorld()); 
           break;
           case 2: Greenfoot.setWorld(new ChristmasWorld(true));
           break;
           case 3: Greenfoot.setWorld(new HalloweenWorld(true));
           break;
        }
    }
    
    /**
     * Creates the image of the button.
     */
    private void createImage()
    {
        setImage(image);
    }
    
    
}
