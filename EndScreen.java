import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EndScreen here.
 * 
 * @authors Casper, Casper, Kasper, Meng and Deividas
 * @version (a version number or a date)
 */
public class EndScreen extends World
{
    private int score;
    private int level;
    private int gameMode;
    /**
     * Constructor for objects of class EndScreen.
     */
    public EndScreen(int score, int level, int gameMode)
    {    
        super(500, 450, 1); 
        this.score = score;
        this.level = level;
        this.gameMode = gameMode;
        
        showInfo();
        createButtons();
    }
    
    /**
     * Displays final score and final level.
     */
    private void showInfo()
    {
        showText("" + score, 362, 185);
        showText("" + level, 362, 266);
    }
    
    /**
     * Creates a quit button on the screen.
     */
    private void createButtons()
    {
        GreenfootImage quitimage = new GreenfootImage("QuitButton.jpg");

        addObject(new Button(1,quitimage), 245,355);
    }
}
