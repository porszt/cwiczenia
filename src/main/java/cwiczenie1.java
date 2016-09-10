import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class cwiczenie1 {

    static List<String> distinct(List<String> list) {
        Set<String> uniqueNames = new HashSet(list);
        List<String> solution = new ArrayList(uniqueNames);
        return solution;
    }

    public static void main(String[] args) {
        List<String> names = new ArrayList();
        names.add("Tomek");
        names.add("Jacek");
        names.add("Tomek");

        System.out.println(distinct(names));
    }
}
