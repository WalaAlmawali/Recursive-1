
public class ParenBit {

    public String  parenBit(String str){

        //Base case
        if(str.startsWith("(") && str.endsWith(")")){
            return str;
        }

        // If first character is not '('
        if(str.charAt(0)!= '('){
            return parenBit(str.substring(1));
        }

    }

}
