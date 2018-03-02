import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class start extends World
{

    /**
     * Constructor for objects of class start.
     * 
     */
    public start()
    {    
        super(1000, 600, 1);
        addObject(new startbutton(),500,325);
        addObject(new play2(),960,560);
        addObject(new how(),120,550);
        Greenfoot.start();
    }
}
