import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ca here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ca extends Actor
{
    /**
     * Act - do whatever the ca wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */;
    public static GreenfootSound bgSound = new GreenfootSound("10 Arpanauts.mp3");
    public void act() 
    {
        setRotation(180);
        dead();
        setLocation(getX(),getY()+3);
        if (getY() >= getWorld().getHeight()+(getImage().getHeight()/2)
            || getOneIntersectingObject(ca.class)!= null) {
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
        if(getY() >= getWorld().getWidth()-1){
            getWorld().removeObject(this);
        }
    }
}
