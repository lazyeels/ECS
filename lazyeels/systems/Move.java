package systems;

import lazyeels.Engine;
import lazyeels.Entity;

import components.Position;

import java.util.ArrayList;


public class Move extends SystemObj
{
    private static ArrayList<Entity> entities;

    public Move(Engine engine, String name)
    {
        super(engine, name);

        System.out.printf("[System]: %s initialised.\n", this.name);
    }
    
    @Override
    public void update(ArrayList<Entity> entities) {
        System.out.printf("[SystemObj] Updating system: %s\n", this.name);

        for (int i = 0; i < entities.size(); i++) {

            var entity = entities.get(i);
            Position pos = (Position) entity.getComponent("position");

            System.out.printf("Moving entity ID: %d\n", entity.id);
            pos.x += pos.speed;

            entity.setComponent(pos);
            System.out.printf("Moving entity to (%f, %f)\n", pos.x, pos.y);

        }
    }
}
