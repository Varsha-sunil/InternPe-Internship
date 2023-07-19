import java.util.HashMap;

public class Task_1e {

    public static Integer findDuplicate(int[] array) {
        // Create a HashMap to store the frequency of each element
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        // Iterate over the array and update the frequency map
        for (int num : array) {
            // If the element already exists in the map, it is a duplicate
            if (frequencyMap.containsKey(num)) {
                // Check if the frequency is greater than 1 (non-unique duplicate)
                if (frequencyMap.get(num) > 1) {
                    return num; // Return the duplicate element
                }
            } else {
                frequencyMap.put(num, 1); // Add the element to the frequency map
            }
        }

        return null; // No non-unique duplicate found
    }

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 3, 5, 6, 6 };
        Integer duplicate = findDuplicate(array);
        if (duplicate != null) {
            System.out.println("Non-unique duplicate found: " + duplicate);
        } else {
            System.out.println("No non-unique duplicate found.");
        }
    }
}
