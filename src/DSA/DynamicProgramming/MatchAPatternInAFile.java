package DSA.DynamicProgramming;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchAPatternInAFile {
    public static void main(String[] args) {
        // Read the file
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("file.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                // Match the pattern in each line of the file
                Pattern pattern = Pattern.compile("\\w+");
                Matcher matcher = pattern.matcher(line);
                while (matcher.find()) {
                    String match = matcher.group();
                    System.out.println(match);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
