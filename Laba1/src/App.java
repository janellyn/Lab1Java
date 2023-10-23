public class App {
    public static void main(String[] args)  {
        
        byte a = 0;
        byte b = 0;
        byte n = 5;
        byte m = 3;
        byte C = 1;


        if (a > n || b > m) {
            System.out.println("S = 0");
            return;
        }
        if (-C >= a && -C <= n) {
            System.out.println("Error");
            return;
        }

        double S = 0;
        for (byte i = a; i <= n; i++) {
            for (byte j = b; j <= m; j++){
                S +=  (double) (i * j) / (i + C);
            }
        }
        System.out.print("S = " + S);
    }
}