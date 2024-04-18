import java.util.HashMap;
import java.util.Map;

public class Entity {
   public int id = 0;
   public String name;

   public Map<String, Components> components = new HashMap<>();


   public Entity(int id, String name)
   {
      this.id = id;
      this.name = name;
   }
   public void addComponent (Components component)
   {
      components.put(component.name, component);
   }

   public void removeComponent (Components component)
   {
      components.remove(component.name);
   }

   public Map<String, Components> getComponents()
   {
      return components;
   }
}