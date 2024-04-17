public class Appearance extends Components
{
    public String color;
    public int width;
    public int height;

    public Appearance (String name, String color, int width, int height){
        super(name);
        this.color = color;
        this.width = width;
        this.height = height;
    }
}
