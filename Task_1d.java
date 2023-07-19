import java.util.HashSet;

public class Task_1d {

    public static Integer findDuplicate(int[] array) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : array) {
            // If the element is already in the set, it is a duplicate
            if (set.contains(num)) {
                return num; // Return the duplicate element
            } else {
                set.add(num); // Add the element to the set
            }
        }

        return null; // No duplicate found
    }

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 3, 5, 6 };
        Integer duplicate = findDuplicate(array);
        if (duplicate != null) {
            System.out.println("Duplicate found: " + duplicate);
        } else {
            System.out.println("No duplicate found.");
        }
    }
}
