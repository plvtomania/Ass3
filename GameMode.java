import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameMode here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class GameMode extends World
{
    private int row;
    private int column;
    protected int timeCounter;

    private String[] coordinates;
   
    private int zombieSpawnTime = 100;
    private int goldenSpawnTime = 655;
    private int elfSpawnTime = 230;
    
    private int expireTime;
    
    protected game game;
    protected Hammer hammer;

    /**
     * Constructor for objects of class GameMode.
     */
    public GameMode()
    {
        // Create a new world with 500x450 cells with a cell size of 1x1 pixels.
        super(500,450,1);  
         /*   
        if (gameStarted)
        {
            initialize();
            setPaintOrder(Hammer.class, Mole.class);
        }
        else
        {
            Greenfoot.setWorld(new IntroWorld());
        }*/
    }
    
    public void act()
    {
        // this timer counts time in seconds.
        timeCounter++;
        
        
        // Everytime the timer is equal to the zombieSpawnTime, a new zombie is spawned and a sound is played.
        if(checkGameOver())
        {
            //EndScreen endScreen = new EndScreen();
            Greenfoot.setWorld(new EndScreen(game.getScore(), game.getLevel(),1));
        }
            
        if((timeCounter % zombieSpawnTime) == 0 )
        {
            Zombie zombie = new Zombie(expireTime);
            spawnMole(zombie);

            //timeCounterZombie = 0;
        }   
        
        // Everytime the timer is equal to the goldenSpawnTime, a new golden zombie is spawned and a sound is played.
        if((timeCounter % goldenSpawnTime) == 0 )
        {
            GoldenZombie gZombie = new GoldenZombie(expireTime);
            spawnMole(gZombie);
        }
        
        // Everytime the timer is equal to the elfSpawnTime, a new elf is spawned and a sound is played.
        if((timeCounter % elfSpawnTime) == 0)
        {
            Elf elf = new Elf(expireTime);
            spawnMole(elf);
        }
        
        // Displays time, score and level on the set coordinates.
        
        showText("Score " + game.getScore(), 255, 43);
        showText("Level " + game.getLevel(), 400, 43);
        
        game.setScore(hammer.getScore());
   
        // Specification of what happens, when you gain a certain amount of points while playing the game.
        handleScore();
        /*   private int zombieSpawnTime = 100;
         *  private int goldenSpawnTime = 655;
         *  private int elfSpawnTime = 230;*/
    }
    
    private void handleScore()
    {
        if(game.getScore() <= 4)
        {
            game.setLevel(1);
            expireTime = 120;
            zombieSpawnTime = 100;
            goldenSpawnTime = 655;
            elfSpawnTime = 230;
        }
        else if(game.getScore() >= 5 && game.getScore() <= 11)
        {
            game.setLevel(2);
            expireTime = 110;
            zombieSpawnTime = 90;
            goldenSpawnTime = 655;
            elfSpawnTime = 200;
        }
        else if(game.getScore() >= 12 && game.getScore() <= 18)
        {
            game.setLevel(3);
            expireTime = 90;
            zombieSpawnTime = 80;
            goldenSpawnTime = 655;
            elfSpawnTime = 170;
        }
        else if(game.getScore() >= 19 && game.getScore() <= 25)
        {
            game.setLevel(4);
            expireTime = 60;
            zombieSpawnTime = 70;
            goldenSpawnTime = 655;
            elfSpawnTime = 140;
        }
        else if(game.getScore() >= 26 && game.getScore() <= 34)
        {
            game.setLevel(5);
            expireTime = 50;
            zombieSpawnTime = 60;
            goldenSpawnTime = 655;
            elfSpawnTime = 110;
        }
        else if(game.getScore() >= 35 && game.getScore() <= 41)
        {
            game.setLevel(6);
            expireTime = 40;
            zombieSpawnTime = 50;
            goldenSpawnTime = 655;
            elfSpawnTime = 80;
        }
        else if(game.getScore() >= 42 && game.getScore() <= 48)
        {
            game.setLevel(7);
            expireTime = 30;
            zombieSpawnTime = 40;
            goldenSpawnTime = 655;
            elfSpawnTime = 50;
        }
    }
      
    /**
     * This method gets a random coordinate and checks if there is a mole on that coordinate.
     * If there is a mole on the random coordinate it gets another random coordinate and uses it to spawn a mole on that location.
     */
    
    public void spawnMole(Mole object)
    {
        int[] coordinates = getRandomCoordinate();
        
        int x = 0;
        while(!getObjectsAt(coordinates[0], coordinates[1], null).isEmpty() || x == 9)
        {
            coordinates = getRandomCoordinate();
            x++;
        }
        
        addObject(object, coordinates[0], coordinates[1]);
    }
    
    /**
     * Picks a random coordinate from our "coordinates" array. SPlits the string into two seperate strings, and converts those to integers.
     * Returns the integers in an int array.
     */
    private int[] getRandomCoordinate()
    {
        int[] coordinate = new int[2];
        String coordinateString;
        coordinateString = "" + coordinates[Greenfoot.getRandomNumber(9)];
        
        String[] stringSplit = coordinateString.split(",");
        
        for(int i = 0; i < coordinate.length; i++)
        {
            coordinate[i] = Integer.parseInt(stringSplit[i]);
        }
        
        return coordinate;
    }
    
    /**
     * When the game is initialized, a hammer (candy cane) is added at 1,1. Specific values are set for expireTime and timeCounter. 
     * An array of 9 coordinates is created, so it is possible to spawn moles 9 places on the game board.
     */
    public abstract boolean checkGameOver();
    
    public void initialize()
    {
        game = new game();
        hammer = new Hammer();
        addObject(hammer, 1,1);
        
        timeCounter = 0;
        expireTime = 120;
        
        
        createCoordinates();
    }
    
    /**
     * Specific coordinates for 9 holes on the game board.
     */
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

