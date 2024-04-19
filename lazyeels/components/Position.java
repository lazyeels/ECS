package components;

public class Position extends Components {
    public float x;
    public float y;
    public float speed;

    public Position(String name, float x, float y, float speed)
    {
        super(name);

        this.x = x;
        this.y = y;
        this.speed = speed;

    }

    // getters and setters
    public Position getCoordinates()
    {
       return this;
    }

    public void setCoordinates(float x, float y)
    {
        this.x = x;
        this.y = y;
    }
}
