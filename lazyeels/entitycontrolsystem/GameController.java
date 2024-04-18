public class GameController
{
   public static Engine engine = new Engine();
   public static ECS ecs = new ECS(engine);
   public static Player player = new Player("Lazyeels", 100, 100);

   public enum Status{RUNNING, PAUSED, GAMEOVER};
   boolean isRunning = true;

   public void run()
   {
      long lastime = System.nanoTime();
      double AmountOfTicks = 30;
      double ns = 1000000000 / AmountOfTicks;
      double delta = 0;
      int frames = 0;
      double time = System.currentTimeMillis();

      while(isRunning == true) {
         long now = System.nanoTime();
         delta += (now - lastime) / ns;
         lastime = now;

         if(delta >= 1) {
            update();
            render();
            frames++;
            delta--;
            if(System.currentTimeMillis() - time >= 1000) {
               System.out.println("fps:" + frames);
               time += 1000;
               frames = 0;
            }
         }
      }
   }

   public static void init() {
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
   }
   public static void update() {
      player.update();
      ECS.update();
   }

   public static void render() {

   }

   public static void main(String[] args) {
      GameController game = new GameController();
      game.init();
      game.run();
   }
}