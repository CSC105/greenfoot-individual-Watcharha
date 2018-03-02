import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class score here.
 * Q
 * @author (your name) 
 * @version (a version number or a date)
 */
public class score extends Actor
{
    public static int score = 0;
    public void act() 
    {
        setImage(new GreenfootImage("Score : " + score, 24, Color.BLACK, Color.WHITE));
        if(score > 30){
           Greenfoot.setWorld(new Win());
        }
    }    
    public void addScore(int x)
    {
        score = score+x;
    }
    public void setScore(int score){
        this.score = score;
    }
    public score(){
        score = 0;
    }
}
