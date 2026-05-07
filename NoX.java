
public class NoX {

    public String  noX(String str){

        //Base case
        if(str.length() == 0){
            return "";
        }

        // If the first character is 'x', skip it
        if (str.charAt(0) == 'x') {

            return noX(str.substring(1));

        // Otherwise, include the character in the result
        }else{
            return str.charAt(0) + noX(str.substring(1));
        }


    }
}
