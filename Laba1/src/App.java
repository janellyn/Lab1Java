
public class App {
    public static void main(String[] args) throws Exception  {
        
        int studentId = 1309;
        
        byte a = 2;
        byte b = 1;
        byte n = 8;
        byte m = 7;

        double result = calculateFunction(studentId, a, b, n, m);
        
        System.out.println("Результат обчислення: " + result);
    }

    public static double calculateFunction(int studentId, byte a, byte b, byte n, byte m) throws Exception {
        
        int c2 = studentId % 2;
        int c3 = studentId % 3;
        int c5 = studentId % 5;

        int c = c3;

        if (a > n || b > m) {
            return 0;
        }

        byte S = 0;
        for (byte i = a; i <= n; i++) {
            for (byte j = b; j <= m; j++){
                
                if (i + c == 0 || i - c == 0) { 
                    throw new Exception("Cannot / by zero"); 
                }

                switch (c2) {
                    case 0:
                    switch (c5) {
                        case 0:
                            S +=  (byte) (i * j) / (i + c);
                            break;
                        case 1:
                            S +=  (byte) (i / j) / (i + c);
                            break;
                        case 2:
                            S +=  (byte) (i % j) / (i + c);
                            break;
                        case 3:
                            S +=  (byte) (i + j) / (i + c);
                            break;
                        case 4:
                            S +=  (byte) (i - j) / (i + c);
                            break;
                        }
                    break;

                    case 1:
                        switch (c5) {
                        case 0:
                            S +=  (byte) (i * j) / (i - c);
                            break;
                        case 1:
                            S +=  (byte) (i / j) / (i - c);
                            break;
                        case 2:
                            S +=  (byte) (i % j) / (i - c);
                            break;
                        case 3:
                            S +=  (byte) (i + j) / (i - c);
                            break;
                        case 4:
                            S +=  (byte) (i - j) / (i - c);
                            break;
                        }  
                    break;
                }
            }
        }
        return S;
    }
}
