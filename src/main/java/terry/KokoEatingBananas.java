package terry;

import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

/**
 * 875. Koko Eating Bananas [Medium]
 * <p>
 * Koko loves to eat bananas. There are N piles of bananas,
 * the i-th pile has piles[i] bananas. The guards have gone
 * and will come back in H hours. Koko can decide her
 * bananas-per-hour eating speed of K. Each hour, she
 * chooses some pile of bananas, and eats K bananas from
 * that pile. If the pile has less than K bananas, she eats
 * all of them instead, and won't eat any more bananas
 * during this hour.
 * <p>
 * Koko likes to eat slowly, but still wants to finish
 * eating all the bananas before the guards come back.
 * Return the minimum integer K such that she can eat all
 * the bananas within H hours.
 */
public class KokoEatingBananas extends BinarySearchTemplate {

    public int minEatingSpeed(List<Integer> piles, final int hours) {
        int left = 1;
        int right = Collections.max(piles);
        Predicate<Integer> eatBananasWithinHours = value -> piles
                .stream()
                .map(pile -> (pile - 1) / value + 1)
                .reduce(0, Integer::sum)
                <= hours;

        return search(left, right, eatBananasWithinHours);
    }
}