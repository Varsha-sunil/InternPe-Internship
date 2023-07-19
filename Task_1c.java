public class Task_1c {

    public static int findDuplicate(int[] nums) {
        int n = nums.length;
        int duplicate = -1;

        for (int i = 0; i < n; i++) {
            int index = Math.abs(nums[i]) - 1;

            if (nums[index] < 0) {
                duplicate = Math.abs(nums[i]);
                break;
            }

            nums[index] = -nums[index];
        }

        return duplicate;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 3, 4, 2, 2 };
        int duplicate = findDuplicate(nums);

        System.out.println("Duplicate element: " + duplicate);
    }
}
