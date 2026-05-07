
public class BunnyEars2 {

    public int bunnyEars(int n){

        //Base case
        if(n == 0){
            return 0;
        }

        //Recursive case
        return 2 + bunnyEars(n - 1);

    }


}
