public class interface2 {

    class App{
        public int[] Arr = new int [5];

        App (App a) {
            for (int i = 0; i < a.Arr.length; i++) {
                Arr[i] = i;
            }
        }
    }
    public static void main(String[] args) {
        App A1 = new App();
        App A2 = new App(A1);
        A1.Arr[0] = 100;
        A2.Arr[0] = 200;
    }
}
