
public class Count8 {

    public int count8(int n){

        //Base case
        if(n == 0){
            return 0;
        }

        // Get the last digit
        int lastDigit = n % 10;

        // Get the second last digit
        int secondLastDigit = (n / 10) % 10;


        // If the last digit is 8
        if (lastDigit == 8) {

            // If the previous digit is also 8
            if (secondLastDigit == 8) {
                return 2 + count8(n / 10);
            }

        }
    }


}
