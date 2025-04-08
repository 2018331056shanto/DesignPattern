package concreteStrategy;

import strategy.SortingStrategy;

import java.util.List;

public class InsertionSortStrategy implements SortingStrategy {
    @Override
    public void sort(List<Integer> numbers) {

        int n = numbers.size();
        for (int i = 1; i < n; i++) {
            int key = numbers.get(i);
            int j = i - 1;

            // Shift elements greater than key to one position ahead
            while (j >= 0 && numbers.get(j) > key) {
                numbers.set(j + 1, numbers.get(j));
                j--;
            }

            numbers.set(j + 1, key);
        }

        numbers.stream().forEach(number-> System.out.print(number+" "));

    }
}
