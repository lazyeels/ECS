import java.util.ArrayList;

public class Render extends SystemObj
{

    public Render(Engine engine, String name)
    {
        super(engine, name);
    }

    public static void update(ArrayList<Entity> entities) {
        for (int i = 0; i < entities.size(); i++) {
            Entity entity = entities.get(i);
            System.out.printf("Drawing entity ID: %d", entity.id);
        }
    }
}
