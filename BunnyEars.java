

public class BunnyEars {

    public int  bunnyEars2(int n){

        //base case
        if(n == 0){
            return 0;
        }

        // Check if the current bunny number is even
        if(n % 2 == 0){
            return 3 +bunnyEars2(n - 1);
        }else{

            return 2 + bunnyEars2(n - 1);
        }

    }
}
