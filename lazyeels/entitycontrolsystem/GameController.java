public class GameController
{
   public static Engine engine = new Engine();
   public static ECS ecs = new ECS(engine);
   public static Player player = new Player("Lazyeels", 100, 100);

   public enum Status{RUNNING, PAUSED, GAMEOVER};

   public static void main(String[] args) {
      Status gameStatus = Status.RUNNING;

      ECS.addSystem(new Render(engine, "render"));
      ECS.addSystem(new Move(engine, "move"));

      for (int i=0; i < 3; i++) {

         Entity e = new Entity(i, "NPC");

         Appearance look = new Appearance("appearance", "red", 32, 64);
         Position position = new Position("position", 0.0f, 0.0f, 2.0f);

         e.addComponent(look);
         e.addComponent(position);

         ecs.addEntity(e);
      }
      player.move();

      ECS.update();
   }
}