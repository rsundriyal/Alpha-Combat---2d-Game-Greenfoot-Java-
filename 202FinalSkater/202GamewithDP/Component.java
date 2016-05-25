import greenfoot.*;
import java.util.*;

/**
 * Write a description of class Component here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface Component
{    
    public void addChild(Component c);
    public void removeChild(Component c);
    public Component getChild(int i);
    public List<Component> getAllChild();
    public void setFasterFlag();
   
}
