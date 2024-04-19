package systems;

import lazyeels.Engine;
import lazyeels.Entity;

import java.util.ArrayList;

public class Render extends SystemObj
{
    private static ArrayList<Entity> entities;

    public Render(Engine engine, String name)
    {
        super(engine, name);

        System.out.printf("[System]: %s initialised.\n", this.name);
    }
    
    @Override
    public void update(ArrayList<Entity> entities) {
        System.out.printf("[SystemObj] Updating system: %s\n", this.name);

        for (int i = 0; i < entities.size(); i++) {
            var entity = entities.get(i);
            System.out.printf("Drawing entity ID: %d\n", entity.id);
        }
    }
}
