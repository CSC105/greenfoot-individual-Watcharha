import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ge here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ge extends Actor
{
    /**
     * Act - do whatever the ge wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    public ge(){
        GreenfootImage image = getImage();  
        image.scale(400, 300);
        setImage(image);
    }
}
