import java.util.HashMap;
import java.util.Map;

public class Person {

    private String name;
    private String surname;
    private String pesel;

    public Person(String name, String surname, String pesel){
        this.name = name;
        this.surname = surname;
        this.pesel = pesel;
    }

    public boolean equals(Object o){
        if(o != null){
            Person p = (Person) o;
            if(p.name.equals(this.name) && p.surname.equals(this.surname) && p.pesel.equals(this.pesel)){
                return true;
            }
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }
}
