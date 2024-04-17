import java.util.ArrayList;

public class ECS
{
   public static Engine engine;
   public static Systems sys;

   public ArrayList<Entity> entities = new ArrayList<Entity>();
   public int _entityCount = 0;

   public ECS (Engine engine)
   {
      this.engine = engine;
      this.sys = new Systems(engine);
   }

   public void clear()
   {
      this.entities.clear();
   }

   public Entity getEntity(int entityID)
   {
      return this.entities.get(entityID);
   }
   public void addEntity(Entity entity)
   {
      this.entities.add(entity);
      this._entityCount = this.entities.size();

      System.out.printf("Added entity %d\n", entity.id);
   }

   public Entity removeEntity(int entityID)
   {
      Entity entity = this.entities.remove(entityID);
      this._entityCount = this.entities.size();
      return entity;
   }

   public static void addSystem(SystemObj system)
   {
      sys.add(system);

      System.out.printf("Added system %s\n", system.name);
   }

   public void removeSystem(String systemName)
   {

   }

   public static void update()
   {
      Entity e;
      for (int i=0; i < sys.systems.size(); i++) {
         SystemObj s = sys.getSystem(i);
         //s.update(this.entities);
         System.out.printf("Running System %s\n", s.name);

      }

   }
}