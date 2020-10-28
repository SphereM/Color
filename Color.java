import java.util.Random;

public class Color {
    private int r;
    private int g;
    private int b;

    Random rand = new Random();

    public Color(int r, int g, int b) {
        this.r = r;
        this.b = b;
        this.g = g;
    }

    public int randR() {
        return rand.nextInt(255);
    }
    public int randB() {
        return rand.nextInt(255);
    }
    public int randG() {
        return rand.nextInt(255);
    }
    
}