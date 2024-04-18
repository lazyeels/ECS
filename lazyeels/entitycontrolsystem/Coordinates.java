public class Coordinates {
    public float x;
    public float y;

    public Coordinates(float x, float y)
    {
        this.x = x;
        this.y = y;
    }

    // getters and setters
    public Coordinates getCoordinates()
    {
       return new Coordinates(this.x, this.y);
    }

    public void setCoordinates(float x, float y)
    {
        this.x = x;
        this.y = y;
    }
}
