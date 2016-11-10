import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class Button here.
 * 
 * @author (your name) 
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
    
    public Button(int input, GreenfootImage image)
    {
        this.input = input;
        this.image = image;
        
        createImage();
    }
    
    public void function(int value)
    {
        switch(input)
        {
           case 1: Greenfoot.setWorld(new IntroWorld()); 
           break;
           case 2: Greenfoot.setWorld(new ChristmasWorld(true));
           break;
        }
    }
    
    private void createImage()
    {
        setImage(image);
    }
    
    
}
