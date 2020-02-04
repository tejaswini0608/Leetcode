class Solution {
   public int[] twoSum(int[] numbers, int target) {

       // declare a hashmap of type <Int, Int>
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

        //declare an array called output of size 2, since we are returning an 2 indices
       int[] output = new int[2];

       // formula : target = curr_num (numbers[i]) + y
       // loop through the array, and find if y is in the map
       // if yes, return
       // if no, add it to the map { curr_num, index }
       for (int i = 0; i < numbers.length; i++) {

            int y = target - numbers[i];

        if (map.containsKey(y)) {
            output[1] = i;
            output[0] = map.get(y);
            return output;
        }

        map.put(numbers[i], i);
    }
    return output;
    }
}

// Time complexity : O(n) - we loop through the array of size n once. When we check     //map.containsKey, the complexity is O(1)

// Space complexity : O(n) : in the worst case, we will store all the elements in the array, hence the map can contain atmost n elements
