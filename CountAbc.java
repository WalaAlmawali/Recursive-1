
public class CountAbc {


    public int countAbc(String str){

        //Base case
        if(str.length() < 3){
            return 0;
        }

        // Get the first 3 characters
        String firstThree = str.substring(0, 3);

        // Check if the substring is "abc" or "aba"
        if(firstThree.equals("abc") || firstThree.equals("aba")){
            return 1+ countAbc(str.substring(1));
        }


    }
}
