import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.ArrayList;

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ChristmasWorld extends World
{
    private int row;
    private int column;
    private int timeCounter;
    private String[] coordinates;
    
    private int[][] board;
    
    private final int SPAWN_TIME = 200;
    
    //private int 
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
        timeCounter++;
        
        if(timeCounter >= SPAWN_TIME)
        {
            spawnMole();
            timeCounter = 0;
        }
    }
    
    /**
     * Constructor for objects of class .
     */
    public ChristmasWorld(boolean gameStarted)
    {
        
        // Create a new world with 500x450 cells with a cell size of 1x1 pixels.
        super(500, 450, 1);  
            
        if (gameStarted)
        {
            initialize();
            setPaintOrder(Hammer.class, Mole.class);
            //addObject.zombie;
        }
        else
        {
            Greenfoot.setWorld(new IntroWorld());
        }
        
       
        
    }
    
    public void spawnMole()
    {
        
        
        int[] coordinates = getRandomCoordinate();
        
        int x = 0;
        while(!getObjectsAt(coordinates[0], coordinates[1], null).isEmpty() || x == 9)
        {
            coordinates = getRandomCoordinate();
            x++;
        }
        
        Zombie zombie = new Zombie();
        addObject(zombie, coordinates[0], coordinates[1]);
 
        
        /*
        if(getObjectsAt(coordinates[0], coordinates[1], null).isEmpty())
        {         
            Zombie zombie = new Zombie();
            addObject(zombie, coordinates[0], coordinates[1]);
            return;  
        }
        else
        {
            coordinates = getRandomCoordinate();
        }
        */
        
        //spawnMole();
        
    }
    
    /**
     * Picks a random coordinate from our "coordinates" array. SPlits the string into two seperate strings, and converts those to integers.
     * Returns the integers in an int array.
     */
    private int[] getRandomCoordinate()
    {
        int[] coordinate = new int[2];
        String coorinateString;
        coorinateString = "" + coordinates[Greenfoot.getRandomNumber(9)];
        
        String[] stringSplit = coorinateString.split(",");
        
        for(int i = 0; i < coordinate.length; i++)
        {
            coordinate[i] = Integer.parseInt(stringSplit[i]);
        }
        
        
        
        return coordinate;
    }
    
    private void initialize()
    {
        
        Hammer hammer = new Hammer();
        addObject(hammer, 1,1);
        
        timeCounter = 0;
        
        createCoordinates();
        board = new int[3][3];
        for(int row = 0; row < 3; row++)
        {
            for(int col = 0; col < 3; col++)
            {
                board[row][col] = 0; 
            }
        }
        //spawnMole();
    }
    
    
    
    private void createCoordinates()
    {
        coordinates = new String[9];
        
        coordinates[0] = "90,130";
        coordinates[1] = "239,130";
        coordinates[2] = "385,130";
        coordinates[3] = "90,238";
        coordinates[4] = "239,238";
        coordinates[5] = "385,238";
        coordinates[6] = "90,352";
        coordinates[7] = "239,352";
        coordinates[8] = "385,352";
    }
}

