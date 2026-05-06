
public class Count7 {

    public int count7(int n){


        // Base case
        if(n == 0){
            return 0;
        }

        // Get the last digit
        int lastDigit =  n % 10;

        //Check if the last digit is equal to 7
        if(lastDigit == 7){

            return 1 + count7(n / 10);
        }

    }



}
