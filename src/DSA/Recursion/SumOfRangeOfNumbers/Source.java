package DSA.Recursion.SumOfRangeOfNumbers;

public class Source {
    public int addOfNumbers(int num1, int num2) {
        if (num2 > num1) {
            return num2 + addOfNumbers(num1, num2-1);
        }
        return 1;
    }

    public static void main(String[] args) {
        Source obj = new Source();
        System.out.println("addition of numbers between 1 and 6:- "+obj.addOfNumbers(1,6));
    }
}
