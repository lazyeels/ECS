public class ECSTest
{
   public static Engine engine = new Engine();
   public static ECS ecs = new ECS(engine);


   public static void main(String[] args) {
      ECS.addSystem(new Render(engine, "render"));
      for (int i=0; i < 10; i++) {

         Components comp = new Appearance("appearance", "red", 32, 64);


         Entity e = new Entity(i, "NPC");
         e.id = i;
         e.addComponent(comp);
         ecs.addEntity(e);
      }

      ECS.update();

   }

}