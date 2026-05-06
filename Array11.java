
public class Array11 {

    public int array11(int[] nums, int index){

        //Base case
        if(index == nums.length){
            return 0;
        }

        //Check the current element equals to 11
        if(nums[index] == 11){
            return 1 + array11(nums, index + 1);
        }else {
            return array11(nums, index + 1);
        }

    }

}
