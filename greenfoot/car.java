import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class car here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class car extends Actor
{
    /**
     * Act - do whatever the car wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static GreenfootSound bgSound = new GreenfootSound("10 Arpanauts.mp3");
    public void act() 
    {
        setLocation(getX(),getY()-3);
        dead();
        if (getY() < - getImage().getHeight()/2
            || getOneIntersectingObject(car.class)!= null) {
            World world;
            world = getWorld();
            world.removeObject(this);
        } 
    }    
    public void dead(){
       if(getOneIntersectingObject(flamingo.class) != null){
        World world;
        world = getWorld();
        playsound.bgSound.stop();
        Greenfoot.setWorld(new gameover());
       }
    }
    public void Gone(){
        if(getY() >= getWorld().getHeight()-1){
            getWorld().removeObject(this);
        }
    }
}
