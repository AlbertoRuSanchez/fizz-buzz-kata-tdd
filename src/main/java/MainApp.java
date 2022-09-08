import java.util.List;

public class MainApp {
    public static void main(String[] args) {

        FizzBuzzService service = new FizzBuzzService();

        List<Integer> listOfValuesToCheckFizzBuzz = List.of(1, 2, 3, 4, 5, 6, -8, 59, -366, 89942, 30);

        for (Integer valueToCheck : listOfValuesToCheckFizzBuzz) {

            try {
                System.out.println(service.executeFizzBuzz(valueToCheck));
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

        }
    }
}
