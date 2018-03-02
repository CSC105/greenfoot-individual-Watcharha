import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class flamingo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class flamingo extends Actor
{
    private int img;
    private int direction;
    GreenfootImage[] flamingoRImage = new GreenfootImage[36];
    GreenfootImage[] flamingoLImage = new GreenfootImage[36];

    public flamingo()   
    {
        GreenfootImage myImage = getImage();
        for(int i=0 ; i<36 ; i++){
            flamingoRImage[i] = new GreenfootImage("Flamingo/Flamingo"+(i+1)+".png");
            flamingoLImage[i] = new GreenfootImage("Flamingo/Flamingo"+(i+1)+".png");
            flamingoLImage[i].scale(30,50);
            flamingoRImage[i].scale(30,50);
            flamingoLImage[i].mirrorHorizontally();
        }
        setImage(flamingoRImage[0]);
    }
    private int speed = 1;
    public void act() {
        if (Greenfoot.isKeyDown("right") || Greenfoot.isKeyDown("d") || Greenfoot.isKeyDown("ก"))
        {
            setLocation(getX()+2,getY());
            img += 1;
            direction = 1;
        }
        if (Greenfoot.isKeyDown("down") || Greenfoot.isKeyDown("s") || Greenfoot.isKeyDown("ห"))
        {
            setLocation(getX(),getY()+2);
            img += 1;
            direction = 1;
            if (Greenfoot.isKeyDown("left") || Greenfoot.isKeyDown("a") || Greenfoot.isKeyDown("ฟ")){
                img += 1;
                direction = -1;
            }
        }
        if (Greenfoot.isKeyDown("left") || Greenfoot.isKeyDown("a") || Greenfoot.isKeyDown("ฟ"))
        { 
            setLocation(getX()-2,getY());
            img += 1;
            direction = -1;
       }
        if (Greenfoot.isKeyDown("up") || Greenfoot.isKeyDown("w") || Greenfoot.isKeyDown("ไ"))
        { 
            setLocation(getX(),getY()-2);
            img += 1;
            direction = 1;
            if (Greenfoot.isKeyDown("left") || Greenfoot.isKeyDown("a") || Greenfoot.isKeyDown("ฟ")){
                img += 1;
                direction = -1;
            }
        }
        checkWalk();
        if(img >= 36)img -= 36;
        if(img < 0)img +=36;
        if(direction == 1){setImage(flamingoRImage[img]);}
        else{setImage(flamingoLImage[img]);
        }
        checkWalk();
        if(img >= 36)img -= 36;
        if(img < 0)img +=36;
        if(direction == 1){setImage(flamingoRImage[img]);}
        else{setImage(flamingoLImage[img]);
        }
    }
    public boolean isAtTop(){
        if(getY() < 55) {
        return true;
    }
    else {
        return false;
    }
    }
    
    public boolean isAtBottom(){
        if(getY() > getWorld().getHeight()-getImage().getHeight()+5) {
        return true;
    }
    else {
        return false;
    }
    }
    
    public boolean isAtLeft(){
         if(getX() < getImage().getWidth()) {
        return true;
    }
    else{
        return false;
    }
    }
    
     public boolean isAtRight(){
        if(getX() > getWorld().getWidth()-getImage().getWidth()) {
        return true;
    }
    else{
        return false;
    }
    }
    
    public void checkWalk(){
        if(isAtRight()==true){
            setLocation(getX()-2,getY());
        }
        if(isAtLeft()==true){
            setLocation(getX()+2,getY());
        }
        if(isAtBottom()==true){
            setLocation(getX(),getY()-2);
        }
        if(isAtTop()==true){
            setLocation(getX(),getY()+2);
        }
    }
}
