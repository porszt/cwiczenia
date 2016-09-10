
public class task3 {

    public static void main(String[] args) {

        String a1 = "coś";
        String a2 = "coś";

        System.out.println(a1==a2);
        System.out.println(a1.equals(a2));

        Person person1 = new Person("lukasz", "a", "1");
        Person person2 = new Person("lukasz", "a", "1");

        System.out.println(person1.equals(person2)) ;
    }




}
