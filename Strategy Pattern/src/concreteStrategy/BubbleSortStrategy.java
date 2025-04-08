package concreteStrategy;

import strategy.SortingStrategy;

import java.util.Collections;
import java.util.List;

public class BubbleSortStrategy implements SortingStrategy {
    @Override
    public void sort(List<Integer> numbers) {
        int n = numbers.size();
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (numbers.get(j) > numbers.get(j + 1)) {
                    // Swap elements
                    Collections.swap(numbers, j, j + 1);
                    swapped = true;
                }
            }

            if (!swapped) break;
        }
        numbers.stream().forEach(x -> System.out.print(x+" "));
    }
}
