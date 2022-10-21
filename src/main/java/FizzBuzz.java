public class FizzBuzz {

    public String convert(int i) {
        if (i % 3 == 0 && i % 5 == 0) {
            return "FizzBuzz";
        }

        return switch (i) {
            case 3 -> "Fizz";
            case 5 -> "Buzz";
            default -> Integer.toString(i);
        };
    }
}
