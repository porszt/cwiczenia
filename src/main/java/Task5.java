import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Task5 {

    public static void main(String[] args) {

        FileInputStream in = null;
        FileOutputStream out = null;

        try{
            in = new FileInputStream("src/main/resources/wejsciowy.txt");
            out = new FileOutputStream("src/main/resources/wyjsciowy.txt");
            int c;

            while((c = in.read()) !=-1){
                System.out.println(c);
                out.write(c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null){
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (out != null){
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
