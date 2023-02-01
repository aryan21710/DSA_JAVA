package Playground.Exercise;

 class A {
     static String s=" ";
     protected A() {
         s+="A ";
     }
}

class B extends A {
    private B() {
        s+="B ";
    }
}




public class Test extends A {

       private Test() {
            s+="C ";
        }
    public static void main(String[] args) {
            new Test();
            System.out.println("upGrad".length());
        }
    }


