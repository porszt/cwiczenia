
public class Task4 {

    public static void main(String[] args) {

        Task4 task4 = new Task4();
        try {
            task4.peselValidate(110);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void peselValidate(int pesel) throws Exception{
            if(pesel < 5){
                throw new Exception("Błedna suma kontrolna");
            }
            if(pesel<=10){
                throw new Exception(("Błędny pesel"));
            }
            if(pesel>10){
                System.out.println("pesel jest git");
            }
    }



}
