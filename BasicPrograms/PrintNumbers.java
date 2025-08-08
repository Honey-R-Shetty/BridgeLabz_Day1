package BasicPrograms;

import java.util.stream.IntStream;

public class PrintNumbers {
	public static void main(String[] args) {
        IntStream.range(1, 101).forEach(System.out::println);
    }
}
