import greenfoot.*;  
import java.util.*;


public class Blocker extends Component
{
    private GreenfootImage image1;
    private GreenfootImage image2;
    private GreenfootImage image3;
    private GreenfootImage image4;
    private GreenfootImage image5;
    private GreenfootImage image6;
    private Actor collided;
    private boolean collision;
    private Actor collidedVehicle;
    private boolean moveFasterFlag = false;
    
    public Blocker()
    {
       
       image1 = new GreenfootImage("crabby.png");
       image2 = new GreenfootImage("greenie.png");
       image3 = new GreenfootImage("pinkie.png");
       image4 = new GreenfootImage("squid.png");
       image5 = new GreenfootImage("bluie.png");
       image6 = new GreenfootImage("robot.png");   
       
       image1.scale(90,90);  
       image2.scale(90,90);  
       image3.scale(90,90);
       image4.scale(90,90);
       image5.scale(90,90);
       image6.scale(90,90);
       
       randomImage();

    }
    /**
     * Act - do whatever the Vehicle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        this.removeTouching(Blocker.class);
        if(moveFasterFlag)
            moveFaster();
        else
            moveDown();
        check();
    }
    public void moveDown()
    {
        if(((MyWorld) getWorld()).getState() instanceof OngoingGame)
        {
         
             setLocation(getX(), getY()+4);
        }
    }
    
     public void moveFaster()
    {
       if(((MyWorld) getWorld()).getState() instanceof OngoingGame)
       {
          setLocation(getX(), getY()+8);
       }
    }
    
    public void randomImage()//to get random aliens
    {
       if (Greenfoot.getRandomNumber(15) > 11 && Greenfoot.getRandomNumber(15) <= 14)
       {
          setImage(image1);
       }
       
       else if(Greenfoot.getRandomNumber(15) > 9 && Greenfoot.getRandomNumber(15) <= 11) 
       {
           setImage(image2);
       }
       else if(Greenfoot.getRandomNumber(15) > 6 && Greenfoot.getRandomNumber(15) <= 9) 
       {
           setImage(image3);           
       }
       else if(Greenfoot.getRandomNumber(15) > 4 && Greenfoot.getRandomNumber(15) <= 6) 
       {
           setImage(image4);           
       }
       else if(Greenfoot.getRandomNumber(15) > 2 && Greenfoot.getRandomNumber(15) <= 4) 
       {
           setImage(image5);           
       }
       else
       {
          setImage(image6);
       }
       
   }
    public void check()
    {
        

        if (collided != null || getY()>=(getWorld().getHeight()-1))
        {
           getWorld().removeObject(this);
          
        }
        
    }
    
    public void setFasterFlag(){
        moveFasterFlag = true;
    }
    
    public void addChild(Component c) {}
    public void removeChild(Component c) {}
    public Component getChild(int i) {
        return null;
    }
    public List<Component> getAllChild(){
        return null;
    }
    public void unsetFasterFlag() {
        moveFasterFlag = false;
    }
    public void addCoinScore() {}
}
