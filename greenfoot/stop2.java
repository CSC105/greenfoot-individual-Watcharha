import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class stop2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class stop2 extends Actor
{
    /**
     * Act - do whatever the stop2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootSound bgSound = new GreenfootSound("Prologue.mp3");
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            bgSound.pause();
        }
    }
}
