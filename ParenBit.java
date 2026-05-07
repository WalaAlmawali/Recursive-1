
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

        //If the last character is not ')'
        if(str.charAt(str.length()-1) != ')'){
            return str.substring(0, str.length() - 1);
        }

    }

}
