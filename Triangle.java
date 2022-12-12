public class Triangle {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 4;
        
        if (
            a + b <= c
            || a + c <= b 
            || b + c <= a
            || a == 0 
            || b == 0
            || c == 0
            ) {
            System.out.println("Треугольник невозможен");
        } else {
            System.out.println("Треугольник возможен");
        }
    }
}