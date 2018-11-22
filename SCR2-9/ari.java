import greenfoot.*;

/**
 * Write a description of class ari here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ari extends Actor
{
    /**
     * Act - do whatever the ari wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
           if(Greenfoot.isKeyDown("left"))// Add your action code here.
        {
            setRotation(180);
            move(4);
            
            
    } // Add your action code here.
    }    
}
