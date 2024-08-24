package terry;

import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

/**
 * 1482. Minimum Number of Days to Make m Bouquets [Medium]
 * <p>
 * Given an integer array bloomDay, an integer m and an integer k.
 * We need to make m bouquets. To make a bouquet, you need to use
 * k adjacent flowers from the garden. The garden consists of n
 * flowers, the ith flower will bloom in the bloomDay[i] and then
 * can be used in exactly one bouquet. Return the minimum number
 * of days you need to wait to be able to make m bouquets from
 * the garden. If it is impossible to make m bouquets return -1.
 */
public class DaysToMakeBouquet extends BinarySearchTemplate {

    public int calculateMinimumDaysToMakeBouquet(List<Integer> bloomDay, int bouquetCount, int flowers) {
        if (bloomDay.size() < bouquetCount * flowers) {
            return -1;
        }

        int left = 1;
        int right = Collections.max(bloomDay);
        Predicate<Integer> predicate = day -> {
            long bloomCount = bloomDay.stream().filter(i -> i <= day).count();
            return bloomCount >= (long) bouquetCount * flowers;
        };

        return search(left, right, predicate);
    }

    public int calculateMinimumDaysToMakeBouquetExample(List<Integer> bloomDayList, int bouquetCount, int flowers) {
        if (bloomDayList.size() < bouquetCount * flowers) {
            return -1;
        }

        int left = 1;
        int right = Collections.max(bloomDayList);
        Predicate<Integer> predicate = day -> {
            int bouquets = 0;
            int blooms = 0;
            for (Integer bloomDay : bloomDayList) {
                if (bloomDay > day) {
                    blooms = 0;
                } else {
                    bouquets += (blooms + 1) / flowers;
                    blooms += (blooms + 1) % flowers;
                }
            }
            return bouquets >= bouquetCount;
        };

        return search(left, right, predicate);
    }
}