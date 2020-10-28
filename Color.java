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

    public int lighterDarkerRed(int percent) {
        r = r + (255*percent/100);
        if (r >= 255) {r = 255;}
        if (r <= 0) {r = 0;}
        return r;
    }
    public int lighterDarkerGreen(int percent) {
        g = g + (255*percent/100);
        if (g >= 255) {g = 255;}
        if (g <= 0) {g = 0;}
        return g;
    }
    public int lighterDarkerBlue(int percent) {
        b = b + (255*percent/100);
        if (b >= 255) {b = 255;}
        if (b <= 0) {b = 0;}
        return b;
    }
    
}