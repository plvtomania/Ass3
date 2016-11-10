import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EndScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EndScreen extends World
{
    private int score;
    private int level;
    private int gameMode;
    /**
     * Constructor for objects of class EndScreen.
     * 
     */
    public EndScreen(int score, int level, int gameMode)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 450, 1); 
        this.score = score;
        this.level = level;
        this.gameMode = gameMode;
        
        showInfo();
        createButtons();
    }
    
    private void showInfo()
    {
        showText("" + score, 362, 185);
        showText("" + level, 362, 266);
    }
    
    private void createButtons()
    {
        //Button exitButton = ;
        //Button playAgainButton = new Button("Play");
        GreenfootImage quitimage = new GreenfootImage("quitbutton.jpg");
        //GreenfootImage playimage = new GreenfootImage("replaybutton.jpg");
        
        addObject(new Button(1,quitimage), 322,362);
        //addObject(new Button(2,playimage), 157,362);
    }
}
