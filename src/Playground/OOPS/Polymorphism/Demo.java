abstract class HomeLoan {
    public HomeLoan() {
        System.out.println("House 1");
    }

    abstract void numbers();
}

class Bank1 extends HomeLoan {
    public Bank1() {
        System.out.println("Bank1");
    }

    void numbers() {
        System.out.println("Rate of interest is 7.2");
    }
}

public class Demo {
    public static void main(String[] args) {
        HomeLoan obj = new Bank1();
        obj.numbers();
    }
}