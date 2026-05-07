
public class CountHi {

    public int countHi(String str){

        //Base case
        if(str.length()<2){
            return 0;
        }

        //Check if the first two characters are "hi"
        if(str.substring(0,2).equals("hi")){
            return 1 + countHi(str.substring(2));
        }

    }


}
