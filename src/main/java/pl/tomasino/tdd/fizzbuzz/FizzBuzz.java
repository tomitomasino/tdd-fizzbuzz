package pl.tomasino.tdd.fizzbuzz;

public class FizzBuzz {

	final String FIZZ = "Fizz";
	final String BUZZ = "Buzz";
	final String FIZZBUZZ = "FizzBuzz";

	public String convert(int inputNum) {

		if (inputNum <= 0)
			throw new InvalidNumberException();

		String result = "";
		result = Integer.toString(inputNum);

		if (inputNum % 3 == 0)
			result = FIZZ;

		if (inputNum % 5 == 0)
			result = BUZZ;

		if (inputNum % 3 == 0 && inputNum % 5 == 0)
			result = FIZZBUZZ;

		return result;
	}

	public String printResult(int max) {

		String result = "";

		for (int i = 1; i <= max; i++) {
			result += convert(i);
			if (i < max)
				result += ",";
		}

		return result;

	}

}
