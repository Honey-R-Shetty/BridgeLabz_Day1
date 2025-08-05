import java.util.stream.IntStream;

class PrintNumbers{
    public static void main(String[] args) {
        IntStream.range(1, 101).forEach(System.out::println);
    }
}