
public class ChangePi {

    public String changePi(String str){

        //Base case
        if(str.length() == 0){
            return "";
        }

        // Check if the string starts with "pi"
        if(str.charAt(0)== 'p' && str.charAt(1)== 'i'){
            return "3.14" + changePi(str.substring(2));
        }

    }

}
