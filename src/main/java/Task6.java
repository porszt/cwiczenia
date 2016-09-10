import java.io.*;

/**
 * Created by porszt on 10.09.16.
 */
public class Task6 {

    public static void main(String[] args) {

        BufferedReader in = null;
        BufferedWriter out = null;

        try{
            in = new BufferedReader(new FileReader("src/main/resources/wejsciowy.txt"));
            out = new BufferedWriter(new FileWriter("src/main/resources/wyjsciowy.txt"));

            String c;

            while((c = in.readLine()) !=null){
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
