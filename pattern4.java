// 1
// 12
// 123
// 1234
// 12345
// 123456

public class pattern4 {
    public static void main(String[] args) {
        p(6);
    }

    static void p(int n){
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= row; col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
