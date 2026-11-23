//Pattern: Boyer–Moore Voting Algorithm

class Solution {
    public int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }
        return candidate;
    }
 }
// Time: O(n)
// Space: O(1)

// 1. Brute Force – Nested Loops


// class Solution {
//     public int majorityElement(int[] nums) {
//         int n = nums.length;
//         for (int i = 0; i < n; i++) {
//             int count = 0;
//             for (int j = 0; j < n; j++) {
//                 if (nums[i] == nums[j]) {
//                     count++;
//                 }
//             }
//             if (count > n / 2) {
//                 return nums[i];
//             }
//         }
//         return -1;
//     }
// }

// Time: O(n²)
// Space: O(1)

// 2. Better – HashMap

// class Solution {
//     public int majorityElement(int[] nums) {
//         HashMap<Integer, Integer> map = new HashMap<>();
//         int n = nums.length;
//         for (int num : nums) {
//             map.put(num, map.getOrDefault(num, 0) + 1);
//             if (map.get(num) > n / 2) {
//                 return num;
//             }
//         }
//         return -1;
//     }
// }
// Time: O(n) average
// Space: O(n)
