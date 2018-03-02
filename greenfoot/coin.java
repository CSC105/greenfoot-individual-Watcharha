import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class coin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class coin extends Actor
{
    /**
     * Act - do whatever the coin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    long frame = 0;
    
    public void act() 
    {
        checkWalk();
        get();
        if (frame >= 600) {
            getWorld().removeObject(this);
        }
        frame++;
    }
    public coin()
    {
        GreenfootImage image = getImage();  
        image.scale(50, 50);
        setImage(image);
    }
    public void get(){
       if(getOneIntersectingObject(flamingo.class) != null){
        World world;
        world = getWorld();
        world.removeObject(this);
        score.score++;
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
