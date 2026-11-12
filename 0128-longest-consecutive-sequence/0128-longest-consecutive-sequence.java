class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        ArrayList<Integer> list = new ArrayList<>(set);

        int maxCount = 0;

        for (int i = 0; i < list.size(); i++) {

            int num = list.get(i);

            if (!set.contains(num - 1)) {

                int count = 1;
                int current = num;

                while (set.contains(current + 1)) {
                    current++;
                    count++;
                }

                maxCount = Math.max(maxCount, count);
            }
        }

        return maxCount;
    }
}
