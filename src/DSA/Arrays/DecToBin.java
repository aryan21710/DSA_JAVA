package DSA.Arrays;

public class DecToBin {
    public static void main(String[] args) {
        String c="";
//        System.out.println("Decimal of 10 is: ");
//        toBinary(11);
        System.out.println(toBinaryUsingRecursion(11,c));

//        toBinaryUsingRecursion(11,c);
    }

    public static void toBinary(int decimal){
        int binary[] = new int[40];
        int index = 0;
        while(decimal > 0){
            binary[index++] = decimal%2;
            decimal = decimal/2;
        }
        for(int i = index-1;i >= 0;i--){
            System.out.print(binary[i]);
        }
        System.out.println();//new line
    }

    static String toBinaryUsingRecursion(int decimal, String c) {
        if (decimal==0)
            return "";
        c+=decimal%2;
        return toBinaryUsingRecursion(decimal/2,c);

    }
}
