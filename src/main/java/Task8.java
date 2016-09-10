import java.io.OptionalDataException;
import java.util.Optional;

public class Task8 {

    void foo(String a){
        Optional.of(a);
    }

//    String foo2(int a){
//
//    }

    public static void main(String[] args) {

        Task8  task8= new Task8();

        task8.foo("coś");
    }
}
