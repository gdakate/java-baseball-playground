import java.util.Scanner;

public class StringSplitter {
    public static String[] value;

    public StringSplitter() {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        value = s.split(" ");
        Converter converter = new Converter(value);
    }

}
