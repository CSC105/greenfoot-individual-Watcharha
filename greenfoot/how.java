import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class how here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class how extends Actor
{
    /**
     * Act - do whatever the how wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new ho());
        }
    }    
    public how(){
        GreenfootImage image = getImage();  
        image.scale(200, 50);
        setImage(image);
    }
}
