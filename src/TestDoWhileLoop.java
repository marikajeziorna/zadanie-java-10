public class TestDoWhileLoop {
    public static void main(String[] args) {
        double i = 0;
        do {
            System.out.printf("Display number: %.2f \n", i);
            i += 0.1;
        }
        while (i <= 3.1);
    }
}
