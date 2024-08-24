package terry;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.IntStream;

/**
 * 1201. Ugly Number III [Medium]
 * <p>
 * Write a program to find the n-th ugly number. Ugly
 * numbers are positive integers which are divisible by
 * a or b or c.
 */
public class UglyNumber3 extends BinarySearchTemplate {

    public int nthUglyNumber(int nth, int[] divisors) {
//
//      def enough(num) -> bool:
//          total = num//a + num//b + num//c - num//ab - num//ac - num//bc + num//abc
//          return total >= n
//
//      ab = a * b // math.gcd(a, b)
//      ac = a * c // math.gcd(a, c)
//      bc = b * c // math.gcd(b, c)
//      abc = a * bc // math.gcd(a, bc)
//
        List<Integer> intermediate = new ArrayList<>();
        intermediate.add(divisors[0]);
        intermediate.add(divisors[1]);
        intermediate.add(divisors[2]);
        intermediate.add(-divisors[0] * divisors[1]/gcd(divisors[0], divisors[1]));
        intermediate.add(-divisors[0] * divisors[2]/gcd(divisors[0], divisors[2]));
        intermediate.add(-divisors[1] * divisors[2]/gcd(divisors[1], divisors[2]));
        intermediate.add(divisors[0] * intermediate.get(5)/gcd(divisors[0], intermediate.get(5)));

        int left = divisors[0];
        int right = nth * divisors[divisors.length - 1];

        Predicate<Integer> uglyTest = num ->
                intermediate.stream().mapToInt(x -> num / x).sum() >= nth;

        return search(left, right, uglyTest);
    }

    public static int gcd(int b, int a) {
        while (b != 0) {
            int t = a;
            a = b;
            b = t % b;
        }
        return a;
    }

    public int nthUglyNumberZ(int nth, int[] divisors) {
        int uglyNumberCount = 0;
        int uglyNumber = -1;
        int n = 1;
        while (uglyNumber == -1) {
            for (int i = 0, j = 0; i < divisors.length && j < 1; ++i) {
                if (n % divisors[i] == 0 && n / divisors[i] > 0) {
                    ++uglyNumberCount;
                    ++j;
                    if (uglyNumberCount == nth) {
                        uglyNumber = n;
                    }
                }
            }
            ++n;
        }
        return uglyNumber;
    }

    public int nthUglyNumber0(int nth, int[] divisors) {
        int left = divisors[0];
        int right = nth * divisors[divisors.length - 1];

        Predicate<Integer> uglyTest = num -> IntStream
                .iterate(num, n -> n > 0, n -> --n)
                .map(n -> IntStream
                        .of(divisors)
                        .filter(divisor -> n % divisor == 0 && n / divisor > 0)
                        .findFirst()
                        .isPresent() ? 1 : 0
                )
                .sum() >= nth;

        return search(left, right, uglyTest);
    }

    public int nthUglyNumberLoop(int nth, int[] divisors) {
        int left = divisors[0];
        int right = nth * divisors[divisors.length - 1];
        Predicate<Integer> uglyTest = num -> {
            int count = 0;
            for (int n = num; n > 0; --n) {
                for (int i = 0, j = 0; i < divisors.length && j < 1; ++i) {
                    if (n % divisors[i] == 0 && n / divisors[i] > 0) {
                        ++count;
                        ++j;
                    }
                }
            }

            return count >= nth;
        };

        return search(left, right, uglyTest);
    }
}