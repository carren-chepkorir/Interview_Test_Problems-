import java.util.List;
//list is imported from java util package

public class LargestDifference {

    public static int FindLargestDifference(List<Integer> numbers) {
        // if statement checks if the numbers in the list are less than two
        // it should be more than 2 for the difference to be calculated
        if (numbers.size() < 2) {
            return 0;
        }
        // this method is initialized to keep track of minimum numbers
        int minNum = numbers.get(0);
        int maxDiff = 0;

        for (int i = 1; i < numbers.size(); i++) {
            int currentNum = numbers.get(i);
            int diff = currentNum - minNum;

            if (diff > maxDiff) {
                maxDiff = diff;
            }

            if (currentNum < minNum) {
                minNum = currentNum;
            }
        }

        return maxDiff;
    }
}
