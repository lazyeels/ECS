public class Player {
    public String name;
    public Position position;
    private float vx;
    private float vy;
    public float speed;

    public Player(String name, float x, float y) {
        this.name = name;

        this.position = new Position("coordinates", x, y, 2.0f);
        this.position.y = y;

        this.vx = 0.0f;
        this.vy = 0.0f;

        this.speed = 2.0f;
        System.out.printf("Player %s initialised.\n", this.name);
    }

    public Position getPosition() {
        return this.position;
    }

    public void setPosition(float x, float y) {
        this.position.x = x;
        this.position.y = y;
    }

    public void move() {
        System.out.printf("Player moving from coords: (%f, %f)\n", this.position.x, this.position.y);

        this.vx = this.speed;
        this.position.x += this.vx;
        this.position.y += this.vy;

        System.out.printf("Player moving to coords: (%f, %f)\n", this.position.x, this.position.y);

    }

    public void update() {
        this.move();
    }

    public void render() {

    }

}