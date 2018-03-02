import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class fish here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class fish extends Actor
{
    /**
     * Act - do whatever the fish wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int frame = 0;
    public void act() 
    {
        get();
        checkWalk();
        if (frame >= 300) {
            getWorld().removeObject(this);
        }
        frame++;
    }  
    public void get(){
       if(getOneIntersectingObject(flamingo.class) != null){
        World world;
        world = getWorld();
        world.removeObject(this);
        Greenfoot.setWorld(new Win());
       }
    }
    public boolean isAtLeft(){
        if(getX() < 66) {
        return true;
        }
        else{
        return false;
        }
    }
    public boolean isAtTop(){
        if(getY() < 66) {
        return true;
        }
        else {
        return false;
        }
    }
    public void checkWalk(){
        if(isAtLeft()==true){
            setLocation(getX()+3,getY());
        }
        if(isAtTop()==true){
            setLocation(getX(),getY()+3);
        }
    }
}
