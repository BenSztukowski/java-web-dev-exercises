package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Alice {

    public static void main(String[] args) {
        String text = "Alice was beginning to get very tired of sitting by her sister on the bank," +
                " and of having nothing to do: once or twice she had peeped into the book her sister " +
                "was reading, but it had no pictures or conversations in it, 'and what is the use of a book," +
                "' thought Alice 'without pictures or conversation?'";
        String searchText = text.toLowerCase();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter search term:");
        String search = input.nextLine();
        if (searchText.contains(search.toLowerCase())){
            System.out.println("Yeah it's in there. Let's get rid of that for you...");
            Integer length = search.length();
            Integer index = searchText.indexOf(search.toLowerCase());
            System.out.println(index);
            String edited = text.substring(index + length);
            System.out.println(edited);
        } else {
            System.out.println("No, it's not there.");
        }
    }
}
