
public class NoX {

    public String  noX(String str){

        //Base case
        if(str.length() == 0){
            return "";
        }

        // If the first character is 'x', skip it
        if (str.charAt(0) == 'x') {
            return noX(str.substring(1));
        }


    }
}
