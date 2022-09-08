import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class FizzBuzzServiceShould {

    private FizzBuzzService underTest;

    @BeforeEach
    void setUp() {
        underTest = new FizzBuzzService();
    }

    @Test
    void throw_IllegalArgumentException_when_no_positive_integer_is_given_as_param() {

        //Given
        Integer negativeNumber = -9;

        //When
        //Then
        assertThatThrownBy(() -> underTest.executeFizzBuzz(negativeNumber)).
                isInstanceOf(IllegalArgumentException.class)
                .hasMessage(negativeNumber + " is not a positive integer");

    }

    @ParameterizedTest
    //Given
    @CsvSource({"2,2", "3,Fizz", "8,8", "9, Fizz", "21,Fizz"})
    void return_Fizz_when_multiple_of_three_and_not_five_is_given_as_param(Integer value, String expectedResponse) {

        //When
        String response = underTest.executeFizzBuzz(value);

        //Then
        assertThat(response).isEqualTo(expectedResponse);
    }

    @ParameterizedTest
    //Given
    @CsvSource({"2,2", "3,Fizz", "5,Buzz", "20, Buzz", "50,Buzz"})
    void return_Buzz_when_multiple_of_five_and_not_three_is_given_as_param(Integer value, String expectedResponse) {

        //When
        String response = underTest.executeFizzBuzz(value);

        //Then
        assertThat(response).isEqualTo(expectedResponse);
    }

    @ParameterizedTest
    //Given
    @CsvSource({"15, FizzBuzz", "3,Fizz", "5,Buzz", "60, FizzBuzz", "30,FizzBuzz"})
    void return_FizzBuzz_when_multiple_of_five_and_three_is_given_as_param(Integer value, String expectedResponse) {

        //When
        String response = underTest.executeFizzBuzz(value);

        //Then
        assertThat(response).isEqualTo(expectedResponse);
    }

}
