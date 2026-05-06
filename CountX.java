
public class CountX {

    public int countX(String str){

        //Base case
        if(str.length() == 0){
            return 0;
        }

        if(str.charAt(0) == 'x'){
            return 1 + countX(str.substring(1))  ;
        }

    }

}
