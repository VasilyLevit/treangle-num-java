/**
 * Написать программу вычисления n-го треугольного числа
 */
public class first {
        public static void main(String[] args) {
        int n = 10;
        int triangleNum = n * (n-1) / 2;
        print(triangleNum);
    }
    
    static void print(int tNum) {
        System.out.println(tNum);
    }
}