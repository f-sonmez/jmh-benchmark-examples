package features.numbers;

import java.util.random.RandomGeneratorFactory;
import java.util.stream.IntStream;

public class RandomNumberGenerator {

    public static void main(String[] args) {
        IntStream intStream = getPseudoInts("L128X128MixRandom", 10);
            for (int item : intStream.toArray()) {
            System.out.println(item);
        }
        System.out.println("--> Standard random number generator:" + generateRandomNumber());
    }

    /**
     * <a href="https://openjdk.org/jeps/356"> for more detail...</a>
     * <br>
     * returns an IntStream with size @streamSize of random numbers generated using the @algorithm.
     * <br>
     * where the lower bound is 0 and the upper is 100 (exclusive)
     * <br><br><br>
     * Some algorithms can use:
     * <ul>
     *     <li>L32X64MixRandom </li>
     *     <li>L32X64StarStarRandom </li>
     *     <li>L64X128MixRandom </li>
     *     <li>L64X128StarStarRandom </li>
     *     <li>L64X256MixRandom </li>
     *     <li>L64X1024MixRandom </li>
     *     <li>L128X128MixRandom </li>
     *     <li>L128X256MixRandom </li>
     *     <li>L128X1024MixRandom </li>
     * </ul>
     *
     * @param algorithm
     * @param streamSize
     * @return
     */
    private static IntStream getPseudoInts(String algorithm, int streamSize) {
        return RandomGeneratorFactory.of(algorithm)
                .create()
                .ints(streamSize, 110, 1030);
    }

    private static double generateRandomNumber() {
        int min = 200;
        int max = 400;
        double number = Math.random() * (max - min + 1) + min;
        return number;
    }
}
