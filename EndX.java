
public class EndX {

    public String endX(String str){

        //Base case
        if(str.length() == 0){
            return "";
        }

        //Check if the first character is x
        if(str.charAt(0) == 'x'){
            return endX(str.substring(1)) + str.charAt(0);
        } else{
            return str.charAt(0) + endX(str.substring(1));
        }

    }

}
