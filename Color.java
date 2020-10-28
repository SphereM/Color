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

    public int randRed() {
        r = rand.nextInt(255);
        return r;
    }
    public int randBlue() {
        b = rand.nextInt(255);
        return b;
    }
    public int randGreen() {
        g = rand.nextInt(255);
        return g;
    }

    //public int 
    
}