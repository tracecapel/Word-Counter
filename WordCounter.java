import java.util.Scanner;
import java.util.StringTokenizer;

public class WordCounter {
  public static int countWords(String input) {
    StringTokenizer stringTokenizer = new StringTokenizer(input, " ");
    input = input.trim();
    return stringTokenizer.countTokens();
  }

  public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    System.out.println("Enter text below");
    String input = scnr.nextLine();

    System.out.println("Words: " + countWords(input));
  }
}