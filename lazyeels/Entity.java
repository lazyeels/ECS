package lazyeels;

import lazyeels.Components;

import java.util.HashMap;
import java.util.Map;


public class Entity {
   public int id;
   public String name;

   public Map<String, Components> components = new HashMap<>();

   public Entity(int id, String name)
   {
      this.id = id;
      this.name = name;
   }

   public Components getComponent (String name)
   {
      return components.get(name);
   }

   public Components setComponent (Components component)
   {
      return components.put(component.name, component);
   }

   public void addComponent (Components component)
   {
      System.out.printf("[Entity] component %s added:", component.name);
      components.put(component.name, component);

      System.out.printf("Attrs: %s\n", components);
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