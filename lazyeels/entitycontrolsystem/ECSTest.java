public class ECSTest
{
   public static Engine engine = new Engine();
   public static ECS ecs = new ECS(engine);
   public static Player player = new Player(100, 100);

   public static void main(String[] args) {
      ECS.addSystem(new Render(engine, "render"));
      for (int i=0; i < 3; i++) {

         Entity e = new Entity(i, "NPC");

         Components comp = new Appearance("appearance", "red", 32, 64);
         e.addComponent(comp);

         ecs.addEntity(e);
      }
      player.move();
      ECS.update();
   }
}