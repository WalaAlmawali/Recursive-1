

public class Triangle {


    public int triangle(int n){

        // Base case
        if(n == 0){
            return 0;
        }
        // Recursive case
        return n + triangle(n - 1);
    }

}
