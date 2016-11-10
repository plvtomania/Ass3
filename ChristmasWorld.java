import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.ArrayList;
import java.awt.Color;

/**
 * Write a description of class MyWorld here.
 * 
 * @authors Casper, Casper, Kasper, Meng and Deividas
 * @version (a version number or a date)
 */
public class ChristmasWorld extends GameMode
{
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public ChristmasWorld()
    {    
        // calling the other constructor with gameStarted = false.
        this(false); 
    }
    
    public void act()
    {
        super.act();
    }
    
    /**
     * Constructor for objects of class .
     */
    public ChristmasWorld(boolean gameStarted)
    {
        // Create a new world with 500x450 cells with a cell size of 1x1 pixels.
        super();  
            
        if (gameStarted)
        {
            super.initialize();
            setPaintOrder(Hammer.class, Mole.class);
        }
        else
        {
            Greenfoot.setWorld(new IntroWorld());
        }
        
    }
    
    /**
     * When the game is initialized, a hammer (candy cane) is added at 1,1. Specific values are set for expireTime and timeCounter. 
     * An array of 9 coordinates is created, so it is possible to spawn moles 9 places on the game board.
     */
    public boolean checkGameOver()
    {
        if(super.game.getSeconds() >= 60)
        {
            return true;
        }
        
        return false;
    }
}

