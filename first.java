/**
 * Написать программу вычисления n-го треугольного числа
 */
public class first {
    public static void main(String[] args) {
        int n = 10;
        int triangleNum = n * (n+1) / 2;
        printRez(triangleNum);
    }
    
    static void printRez(int tNum) {
        System.out.println(tNum);
    }
}