
public class StrCount {

    public int  strCount(String str, String sub){

        // Base case
        if(str.length() < sub.length()){
            return 0;
        }

        // Check if the beginning of str matches sub
        if (str.substring(0, sub.length()).equals(sub)) {

            return 1 + strCount(str.substring(sub.length()), sub);
        }else{
            return strCount(str.substring(1), sub);
        }

    }


}
