package terry;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CapacityToShipPackagesTest {

    @Test
    void calculateCapacityToShipPackages() {
        CapacityToShipPackages calculator = new CapacityToShipPackages();
        int[] weights = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int numberOfDays = 5;
        int expectedCapacity = 15;

        int actualCapacity = calculator.calculateCapacityToShipPackages(weights, numberOfDays);

        assertEquals(expectedCapacity, actualCapacity);
    }

    @Test
    void calculateMinimizeMaximumSum() {
        CapacityToShipPackages calculator = new CapacityToShipPackages();
        int[] weights = {7, 2, 5, 10, 8};
        int numberOfDays = 2;
        int expectedCapacity = 18;

        int actualCapacity = calculator.calculateCapacityToShipPackages(weights, numberOfDays);

        assertEquals(expectedCapacity, actualCapacity);
    }
}