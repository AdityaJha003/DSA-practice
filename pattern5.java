// * 
// * * 
// * * *
// * * * *
// * * * * *
// * * * * * *
// * * * *
// * * *
// * *
// *

public class pattern5 {
    public static void main(String[] args) {
        p(3);
    }

    static void p (int n){
        for(int row = 0; row <= 2*n; row++){
            int totalColsInRow = row > n ? 2*n - row : row;
            for(int col = 0; col <= totalColsInRow; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
