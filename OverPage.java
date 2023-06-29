import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class OverPage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OverPage extends World
{

    /**
     * Constructor for objects of class OverPage.
     * 
     */
    public OverPage()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(950, 550, 1); 
        prepare();
    }  
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Quit quit = new Quit();
        addObject(quit,380,450);
        Replay replay = new Replay();
        addObject(replay,540,450);
        
        showText("The Predator ate you, you  lose!!!", 475, 350);
        showText("Your Score : " + MyWorld.score.getValue()+" points", 475, 380);
        Greenfoot.playSound("gameOver.wav");
    }
}
