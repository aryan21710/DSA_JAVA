package DSA.TimeComplexity;

public class Ex1 {
    public static void main(String[] args) {
        int n=5;
        int count=0;
        while(n>0){
            for(int j=0; j < n; j++){
                count++;
//                System.out.println("Hello");
            }
            n=n/2;
        }
        System.out.println("For n"+n+" "+count);

    }

}
