
public class StrCountDemo {

    public static void main(String[] args){

        //Create an object of the StrCount class
        StrCount strCount = new StrCount();


        // Test the method with different strings
        System.out.println(strCount.strCount("catcowcat","cat"));
        System.out.println(strCount.strCount("catcowcat","cow"));
        System.out.println(strCount.strCount("catcowcat","dog"));

    }


    }
