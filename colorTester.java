import java.util.Scanner;

public class colorTester {

    public static void main(String[] args) {
        int r=0;
        int g=0;
        int b=0;
        Scanner scan = new Scanner(System.in);


        Color color = new Color(r, g, b);
        System.out.println("R = "+color.randR()+" G = "+color.randG()+" B = "+color.randB());
    }
}