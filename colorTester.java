public class colorTester {

    public static void main(String[] args) {
        int r=0;
        int g=0;
        int b=0;


        Color color = new Color(r, g, b);
        r = color.randRed();
        g = color.randGreen();
        b = color.randBlue();

        System.out.println("["+r+", "+g+", "+b+"]");



    }
}