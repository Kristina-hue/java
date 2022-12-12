public class Coordinates {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        //   y
        // 1 | 2
        // - + -x
        // 3 | 4
        if (x > 0 && y > 0) {
            System.out.println("2 четверть");
        } else if (x < 0 && y > 0) {
            System.out.println("1 четверть");
        } else if (x < 0 && y < 0) {
            System.out.println("3 четверть");
        } else if (x > 0 && y < 0) {
            System.out.println("4 четверть");
        } else if (x == 0 && y > 0) {
            System.out.println("Между 1 и 2 четвертью");
        } else if (x == 0 && y < 0) {
            System.out.println("Между 3 и 4 четвертью");
        } else if (x > 0 && y == 0) {
            System.out.println("Между 2 и 4 четвертью");
        } else if (x < 0 && y == 0) {
            System.out.println("Между 1 и 3 четвертью");
        } else if (x == 0 && y == 0) {
            System.out.println("По центру");
        }
    }
}
