import java.util.ArrayList;

public class SystemObj {
   public Engine engine;
   public String name;

   public SystemObj(Engine engine, String name)
   {
      this.engine = engine;
      this.name = name;
   }

   public void update(ArrayList<Entity> entities)
   {
      System.out.printf("[SystemObj] Updating system: %s\n", this.name);
   }
}
