import java.util.ArrayList;

public class Entity {
   public int id = 0;
   public String name;

   public ArrayList<Components> components = new ArrayList<Components>();

   public Entity(int id, String name)
   {
      id = id;
      name = name;
   }
   public void addComponent (Components component)
   {
      components.add(component);
   }

   public void removeComponent (int i) 
   {
      components.remove(i);
   }

}