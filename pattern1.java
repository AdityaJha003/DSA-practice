// * * * * * *
// * * * * * *
// * * * * * *
// * * * * * *
// * * * * * *
// * * * * * *

public class pattern1 {
    public static void main(String[] args) {
        p(6);
    }

    static void p(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
}
