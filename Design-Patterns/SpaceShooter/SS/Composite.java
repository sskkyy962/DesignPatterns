import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

public class Composite extends Component
{
    private List<Component> childs;
    
    public Composite(){
        childs = new ArrayList<Component>();
    }
    
    public void addChild(Component c) {
        childs.add(c);
    }
    
    public void removeChild(Component c) {
        childs.remove(c);
    }
    
    public Component getChild(int i) {
        return childs.get(i);
    }
    
    public List<Component> getAllChild(){
        return childs;
    }
    
    public void setFasterFlag(){
        for(Component eachChild: childs){
            eachChild.setFasterFlag();
        }
    }
    public void unsetFasterFlag() {
       for(Component eachChild: childs){
            eachChild.unsetFasterFlag();
        }
    }
}
