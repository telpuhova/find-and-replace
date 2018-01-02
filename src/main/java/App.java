import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter a sentence");
            String input1 = bufferedReader.readLine();
            System.out.println("Enter a word to find");
            String input2 = bufferedReader.readLine();
            System.out.println("Enter a word to replace");
            String input3 = bufferedReader.readLine();
            FindAndReplace myFindAndReplace = new FindAndReplace();
            String newStr = myFindAndReplace.findAndReplace(input1, input2, input3);
            System.out.println("New sentence: ");
            System.out.println(newStr);
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }
}