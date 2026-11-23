class Solution {
    public int firstMissingPositive(int[] nums) {

        int n = nums.length;
        int i = 0;
        while (i < n) {
            int correctIndex = nums[i] - 1;
            if (nums[i] > 0 &&
                nums[i] <= n &&
                nums[i] != nums[correctIndex]) {
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            } else {
                i++;
            }
        }
        for (i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }
        return n + 1;
    }
}

// Time: O(n)
// Auxiliary Space: O(1)


// brute:
// class Solution {
//     public int firstMissingPositive(int[] nums) {
//         int n = nums.length;
//         for (int i = 1; i <= n + 1; i++) {
//             boolean found = false;
//             for (int num : nums) {
//                 if (num == i) {
//                     found = true;
//                     break;
//                 }
//             }
//             if (!found) return i;
//         }
//         return n + 1;
//     }
// }
// Time: O(n²)
// Space: O(1)

// Better - HashSet :
// class Solution {
//     public int firstMissingPositive(int[] nums) {
//         HashSet<Integer> set = new HashSet<>();
//         for (int num : nums) {
//             set.add(num);
//         }
//         for (int i = 1; i <= nums.length + 1; i++) {
//             if (!set.contains(i)) {
//                 return i;
//             }
//         }
//         return nums.length + 1;
//     }
// }
// Time: O(n) average.
// Space: O(n).