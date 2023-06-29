import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HelpPage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HelpPage extends World
{

    /**
     * Constructor for objects of class HelpPage.
     * 
     */
    public HelpPage()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(950, 550, 1); 
        prepare();
    }
    
    private void prepare()
    {
        BackButton back = new BackButton();
        addObject(back, 72, 50);
    }
}
