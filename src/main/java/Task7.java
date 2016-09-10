import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Task7 {



    public List<String> readFileToList( String filename) throws IOException{
        List<String> plik1 = new ArrayList<String>();
        try(BufferedReader in =new BufferedReader(new FileReader(filename))){
            String c;
            while((c = in.readLine()) !=null){
                plik1.add(c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return plik1;
    }

    public void diff(String file1, String file2) throws IOException {
        List<String> lines1 = readFileToList(file1);
        List<String> lines2 = readFileToList(file2);
        List<String> takieSame = new ArrayList<String>();
        List<String> wynik = new ArrayList<>();

        for(String line : lines1){
                if(lines2.contains(line)){
                    takieSame.add(line);
                }
            }
        for(String line : lines1){
            if(!takieSame.contains(line)){
                wynik.add(line);
            }
        }
        for(String line : lines2){
            if(!takieSame.contains(line)){
                wynik.add(line);
            }
        }
        System.out.println(wynik);

        }


    public static void main(String[] args) throws IOException {
        Task7 task7 = new Task7();

//        System.out.println(task7.readFileToList("src/main/resources/wejsciowy.txt"));
        task7.diff("src/main/resources/wejsciowy.txt", "src/main/resources/wyjsciowy.txt");
    }
}
