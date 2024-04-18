public class Player {
    private float vx;
    private float vy;
    public float speed;

    public Coordinates coordinates = new Coordinates(0.0f, 0.0f);

    public Player(float x, float y) {
        this.coordinates.x = x;
        this.coordinates.y = y;

        this.vx = 0.0f;
        this.vy = 0.0f;

        this.speed = 2.0f;
        System.out.println("Player initialised.");
    }

    public Coordinates getPosition() {
        return this.coordinates;
    }

    public void setPosition(float x, float y) {
        this.coordinates.x = x;
        this.coordinates.y = y;
    }

    public void move() {
        System.out.printf("Current Coords: (%f, %f)\n", this.coordinates.x, this.coordinates.y);
        this.vx = this.speed;
        this.coordinates.x += this.vx;
        this.coordinates.y += this.vy;

        System.out.printf("New Coords: (%f, %f)\n", this.coordinates.x, this.coordinates.y);

    }

    public void update() {
    }

    public void render() {

    }

}