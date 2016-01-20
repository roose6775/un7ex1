import java.io.File;
import java.io.FileReader;

/**
 * Created by Maria on 19.01.16.
 */


class Common {

    private char[] buffer;
    private int numberOfSymbol = 0;
    private int numberOfSpace = 0;

    public Common(){
        File file = new File (Main.class.getClassLoader().getResource("document.txt").getFile());
        try (FileReader reader = new FileReader(file)) {
            buffer = new char[(int)file.length()];
            reader.read(buffer);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public char getSymbol(){
        numberOfSymbol++;
        return buffer[numberOfSymbol-1];
    }

}

public class Main {

    public static void main(String[] args) {

        Common common = new Common();

        Thread thread1 = new Thread(new Runnable() {
            public void run() {


            }
        });

        Thread thread2 = new Thread(new Runnable() {
            public void run() {


            }
        });

    }
}
