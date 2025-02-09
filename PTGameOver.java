import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author Zhang
 * @version May 30
 */
public class PTGameOver extends World
{
    Label titleLabel = new Label("Game Over", 50);
    Label timeLabel = new Label("Chaser survived: " + PokemonWorld.getGameTime() + " seconds.", 35);
    public static Label isBomb = new Label(0, 30);
    /**
     * Constructor for objects of class GameOver.
     * 
     */
    public PTGameOver()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 330, 1);
        
        addObject(titleLabel, getWidth()/2, 100);
        
        PTReturn back = new PTReturn();
        addObject(back, 560, 297);
        
        addObject(timeLabel, getWidth()/2, 200);
        
        addObject(isBomb, getWidth()/2, 250);
    }
}
