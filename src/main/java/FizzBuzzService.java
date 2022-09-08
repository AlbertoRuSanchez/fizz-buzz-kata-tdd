public class FizzBuzzService {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";

    public String executeFizzBuzz(Integer value) {

        if (value < 0) {
            throw new IllegalArgumentException(value + " is not a positive integer");
        }

        String fizzBuzzResponse = "";

        if(isMultipleOf(value, 3)){
            fizzBuzzResponse = FIZZ;
        }

        if(isMultipleOf(value, 5)){
            fizzBuzzResponse += BUZZ;
        }

        return fizzBuzzResponse.equals("") ? String.valueOf(value) : fizzBuzzResponse;
    }

    private boolean isMultipleOf(Integer value, int x) {
        return value % x == 0;
    }

}
