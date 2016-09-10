import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.HashMap;
import java.util.Map;

public class task2 {

    public static void main(String[] args) {

        Person person1 = new Person("Kasia", "Kowalska", "11111111111");
        Person person2 = new Person("Tomek", "Kowalski", "11111111122");
        Person person3 = new Person("Zbyszek", "Nowak", "11111111133");

        Map<String, Person> personMap = new HashMap<String, Person>();
        personMap.put(person1.getPesel(), person1);
        personMap.put(person2.getPesel(), person2);
        personMap.put(person3.getPesel(), person2);


    }


}
