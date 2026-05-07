
public class StrCopies {

    public boolean strCopies(String str, String sub, int n){

        //Base case
        if(n == 0){
            return true;
        }

        //Check if the length of str is less than the length of sub
        if(str.length() < sub.length()){
            return false;
        }

        //Check if the first part of the string matches sub
        if(str.substring(0,sub.length())== sub){
            return strCopies(str.substring(1), sub, n - 1);
        }

    }
}
