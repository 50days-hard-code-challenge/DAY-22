class Solution {
    public int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
      // create a list to store the 
        ArrayList<Integer> list = new ArrayList<>();
        // size of array
        int n = nums.length;
        for(int i = 0;i<n; i++){
            for(int j = i; j<n; j++){
                int temp1 = Math.abs(i-j);
                int temp2 = Math.abs(nums[i]-nums[j]);
                if(temp1>=indexDifference && temp2>=valueDifference){
                  // Store the indices into the list 
                    list.add(i);
                    list.add(j);
                    break;
                }
            }
            
        }

      // if list is empty then return [-1,-1]
          if(list.size() == 0){
              return new int[]{-1,-1};
          }
        // Convert list into array 
        int[] arr = new int[list.size()];
        for(int i = 0;i<list.size(); i++){
            arr[i] = list.get(i);
        }
        return arr;
    }
}
