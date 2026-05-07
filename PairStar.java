
public class PairStar {

    public String pairStar(String str){

        //Base case
        if(str.length() == 0 || str.length() == 1){
            return str;
        }

        if(str.charAt(0) == str.charAt(1)){
            return str.charAt(0) + "*" + str.charAt(1);
        }

    }
}
