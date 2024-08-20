//    1
//   212
//  32123
// 4321234

public class pattern7 {
    public static void main(String[] args) {
        p(4);
    }

    static void p (int n){
        for(int row = 1; row <= n; row++){
            for(int space = 0; space < n-row; space++){
                System.out.print(" ");
            }
            for(int col = row; col >= 1; col--){
                System.out.print(col);
            }
            for(int col = 2; col <= row; col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
