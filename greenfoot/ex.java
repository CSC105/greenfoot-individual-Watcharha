import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ex here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ex extends Actor
{
    /**
     * Act - do whatever the ex wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }   
    public ex()
    {
        GreenfootImage image = getImage();  
        image.scale(200, 200);
        setImage(image);
    }
}
