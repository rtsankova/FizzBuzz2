import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    void given1_returns1() {
        // given
        FizzBuzz fizzBuzz = new FizzBuzz();

        // when
        var output = fizzBuzz.convert(1);

        // then
        assertEquals("1", output);
    }

    @Test
    void given19_returns19() {
        // given
        FizzBuzz fizzBuzz = new FizzBuzz();

        // when
        var output = fizzBuzz.convert(19);

        // then
        assertEquals("19", output);
    }

    @Test
    void given3_returnsFizz() {
        // given
        FizzBuzz fizzBuzz = new FizzBuzz();

        // when
        var output = fizzBuzz.convert(3);

        // then
        assertEquals("Fizz", output);
    }

    @Test
    void given5_returnsBuzz() {
        // given
        FizzBuzz fizzBuzz = new FizzBuzz();

        // when
        var output = fizzBuzz.convert(5);

        // then
        assertEquals("Buzz", output);
    }

    @Test
    void given15_returnsFizzBuzz() {
        // given
        FizzBuzz fizzBuzz = new FizzBuzz();

        // when
        var output = fizzBuzz.convert(15);

        // then
        assertEquals("FizzBuzz", output);
    }

    @Test
    void given1335_returns1335() {
        // given
        FizzBuzz fizzBuzz = new FizzBuzz();

        // when
        var output = fizzBuzz.convert(1335);

        // then
        assertEquals("FizzBuzz", output);
    }
}

/*
1
2
Fizz
4
Buzz
Fizz
7
8
Fizz
Buzz
11
Fizz
13
14
FizzBuzz
16
17
Fizz
19
Buzz
... etc up to 100
 */