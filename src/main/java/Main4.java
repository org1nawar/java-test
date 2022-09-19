import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main4 {
  private static final Pattern EMAIL_PATTERN = Pattern.compile("<(\\S*?)>");
  private static final String AUTHOR_EMAIL = "author-mail ";

  public static void main(String [] args) {


    Matcher matcher = EMAIL_PATTERN.matcher("author-mail koko");
    System.out.println("testA1");
    System.out.println("testA2");
    if (!matcher.find(AUTHOR_EMAIL.length()) || matcher.groupCount() != 1) {
      throw new IllegalStateException("Couldn't parse author email from: ");
    }
  }

}
