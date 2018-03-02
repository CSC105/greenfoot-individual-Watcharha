import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class play2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class play2 extends Actor
{
    /**
     * Act - do whatever the play2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static GreenfootSound bgSound = new GreenfootSound("Prologue.mp3");
    GreenfootImage on = new GreenfootImage("playsound.png");
    GreenfootImage off = new GreenfootImage("stopsound.png");
    private boolean soundOn;
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            soundOn = !soundOn;
            shiftImage();
        }
    }  

    public play2()
    {
        GreenfootImage image = getImage();  
        image.scale(100, 50);
        setImage(image);
    }

    public void shiftImage()
    {
        if(soundOn)
        {
            on.scale(100,50);
            setImage(on);
            bgSound.stop();
        }
        if(!soundOn)
        {
            off.scale(100,50);
            setImage(off);
            bgSound.play();
        }
    }
}
