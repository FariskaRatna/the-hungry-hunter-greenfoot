import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WinPage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WinPage extends World
{

    /**
     * Constructor for objects of class WinPage.
     * 
     */
    public WinPage()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(950, 550, 1); 
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Quit quit = new Quit();
        addObject(quit,500,391);
        Greenfoot.playSound("stageClear.wav");
    }
}