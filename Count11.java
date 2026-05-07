
public class Count11 {

    public int count11(String str){

        //Base case
        if(str.length() <2){
            return 0;
        }

        //Check if the first two characters are "11"
        if(str.substring(0,2).equals("11")){
            return 1 + count11(str.substring(2));

        }else{
            return count11(str.substring(1));
        }

    }

}
