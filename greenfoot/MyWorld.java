import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public static int score = 0;
    private boolean isSpawn = false;
    public MyWorld()
    {    
        super(1000, 600, 1, false); 
        flamingo fla = new flamingo();
        addObject(fla,61,282);
        addObject(new score(),70,570);
        addObject(new playsound(),960,560);
        setPaintOrder (ca.class,car.class,flamingo.class,coin.class,score.class);
    }
    public void act()
    {
        if(Greenfoot.getRandomNumber(750) < 10){
            addObject(new car(),200,1000);
        }
        if(Greenfoot.getRandomNumber(750) < 10){
            addObject(new car(),150,1000);
        }
        if(Greenfoot.getRandomNumber(750) < 10){
            addObject(new car(),550,1000);
        }
        if(Greenfoot.getRandomNumber(750) < 10){
            addObject(new car(),600,1000);
        }
        if(Greenfoot.getRandomNumber(750) < 10){
            addObject(new car(),660,1000);
        }
        if(Greenfoot.getRandomNumber(750) < 10){
            addObject(new ca(),300,-100);
        }
        if(Greenfoot.getRandomNumber(750) < 10){
            addObject(new ca(),350,-100);
        }
        if(Greenfoot.getRandomNumber(750) < 10){
            addObject(new ca(),400,-100);
        }
        if(Greenfoot.getRandomNumber(750) < 10){
            addObject(new ca(),750,-100);
        }
        if(Greenfoot.getRandomNumber(750) < 10){
            addObject(new ca(),800,-100);
        }
        if(Greenfoot.getRandomNumber(1500) < 5){
            addObject(new coin(),Greenfoot.getRandomNumber(900),Greenfoot.getRandomNumber(530));
        }
    }
}