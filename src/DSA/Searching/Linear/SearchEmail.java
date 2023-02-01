package DSA.Searching.Linear;

public class SearchEmail {
    public static void main(String[] args) {
        String[] emails = {"chandler.bing@xyz.com","ross.geller@xyz.com",
                "rachel.greene@xyz.com","joey.tribbiani@xyz.com","monica.geller@xyz.com",
                "phoebe.buffay@xyz.com","sheldon.copper@xyz.com","marie.george@xyz.com"};

        String NewEmail="monic.geller@xyz.com";
        findEmail(emails, NewEmail);


    }

    static void findEmail(String[] emails, String NewEmail) {
        for (int i = 0; i < emails.length; i++) {
            if (emails[i] == NewEmail) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }





}
