import java.util.ArrayList;

public class ECS
{
   public static Engine engine;
   public static Systems sys;

   public static ArrayList<Entity> entities = new ArrayList<Entity>();
   public int _entityCount = 0;

   public ECS (Engine gameEngine)
   {
      engine = gameEngine;
      sys = new Systems(engine);

      System.out.println("[ECS] Initialised.");
   }

   public void clear()
   {
      entities.clear();
   }

   public Entity getEntity(int entityID)
   {
      return entities.get(entityID);
   }
   public void addEntity(Entity entity)
   {
      entities.add(entity);
      _entityCount = entities.size();

      System.out.printf("[ECS] Added entity %d\n", entity.id);
   }

   public Entity removeEntity(int entityID)
   {
      Entity entity = entities.remove(entityID);
      _entityCount = entities.size();

      System.out.printf("[ECS] Removing entity %s. Total entities: %d\n", entityID, this._entityCount);
      return entity;
   }

   public static void addSystem(SystemObj system)
   {
      sys.add(system);

      System.out.printf("[ECS] Added system %s\n", system.name);
   }

   public void removeSystem(String systemName)
   {
      System.out.printf("[ECS] Removed system %s\n", systemName);
   }

   public static void update()
   {
      System.out.println("[ECS] Updating Systems.");

      Entity e;

      for (int i=0; i < sys.systems.size(); i++) {
         SystemObj s = sys.getSystem(i);

         s.update(entities);
      }

   }
}