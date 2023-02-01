package DSA.DynamicProgramming;



public class LongestCommonSubsequence
{

    public static int getLongestCommonSubsequence(String a, String b){

        int[][] matrix = new int[a.length()][b.length()];

        for(int i = 1; i < a.length(); i++){
            for(int j = 1; j < b.length(); j++){
                if(i == 1 || j == 1){
                    matrix[i][j] = 1;
                }else if(a.charAt(i-1) == b.charAt(j-1)){
                    matrix[i][j] = 1 + matrix[i-1][j-1] ;
                }else{
                    matrix[i][j] = Math.max(matrix[i-1][j], matrix[i][j-1]);
                }
            }
        }

        return matrix[a.length()-1][b.length()-1];
    }

    public static void main(String[] args)
    {

        String s1 = "ataatctgtactttcgcgcgcgatacagttgctcaagtagccattcgggtgcctgacggcatgacatgtatgccactttcaccaaagtaatcatcttaac";
        String s2 = "ggtaataaaaggctcgcccaccccgaccctgaagtgaagaagtaacgttgttcatgatcgacccgcatgaattcatagcaacgccgactgatctactccc";

        System.out.println("Length of LCS is" + " " + getLongestCommonSubsequence(s1, s2) );
    }

}


