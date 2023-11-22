import java.util.InputMismatchException;
public class App {
    public static void main(String[] args) throws Exception  {

        calculateFunction();
    }

    public static void calculateFunction() throws Exception {
        
        byte a = 9;
        byte b = 1;
        byte n = 8;
        byte m = 7;
        byte c3 = 1;

        try {
            if(a > n || b > m) { throw new InputMismatchException(); }
        } catch (Exception e) {
            e.printStackTrace(); return;
        }

        byte S = 0;
        for (byte i = a; i <= n; i++) {
            for (byte j = b; j <= m; j++){
                
                try { 
                    if (i - c3 == 0) { 
                    throw new Exception("Cannot / by zero"); 
                } 
                } catch (Exception e) { e.printStackTrace(); return; }

                S +=  (byte) (i - j) / (i - c3);
            }
        }
        System.out.println("Результат обчислення: " + S);
    }
}
