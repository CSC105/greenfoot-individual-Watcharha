import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ba here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ba extends Actor
{
    /**
     * Act - do whatever the ba wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new start());
        }
    }    
    public ba(){
        GreenfootImage image = getImage();  
        image.scale(200, 100);
        setImage(image);
    }
}
