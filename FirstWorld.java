import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FirstWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FirstWorld extends World
{
    Label welcomeLabel = new Label("Choose a game", 40);
    /**
     * Constructor for objects of class FirstWorld.
     * 
     */
    public FirstWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 330, 1);
        
        addObject(welcomeLabel, 300, 100);
        
        Apple apple = new Apple();
        addObject(apple, 100, 200);
        
        Bear bear = new Bear();
        // GreenfootImage img = new GreenfootImage("images/shoot0.png");
        // img.scale(img.getWidth()/2, img.getHeight()/2);
        // setImage(img);
        addObject(bear, 300, 200);
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("1")) {
            PTTitleScreen titleScreen = new PTTitleScreen();
            Greenfoot.setWorld(titleScreen);
        }
        if(Greenfoot.isKeyDown("2")) {
            WSTitleScreen titleScreen = new WSTitleScreen();
            Greenfoot.setWorld(titleScreen);
        }
    }
}
