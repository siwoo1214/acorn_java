package hello;

public class Ex2_3 {
    public static void main(String[] args) {
        int num1 = 0, num2 = 1, num3, idx = 50;
        System.out.print(num1 + ", " + num2);
        for (int i = 1; i < idx; System.out.print(", " + (num3 = num1 + num2)), num1 = num2, num2 = num3, i++);
    }
}
