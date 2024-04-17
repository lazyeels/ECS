import java.util.ArrayList;

public class Systems {
   public static Engine engine;
   public ArrayList<SystemObj> systems = new ArrayList<SystemObj>();

   public Systems(Engine engine)
   {
      this.engine = engine;
   }

   public SystemObj getSystem(int i)
   {
      return this.systems.get(i);

   }

   public void add(SystemObj sys)
   {
      this.systems.add(sys);
   }

   public void remove(int i)
   {
      SystemObj s = this.systems.remove(i);

   }

   public void update()
   {
      for (int i = 0; i < this.systems.size(); i++){
        SystemObj sys = this.systems.get(i);
        System.out.printf("Running sys %s", sys.name);

      }

   }
}
