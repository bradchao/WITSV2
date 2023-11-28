package tw.brad.apps;

import tw.brad.utils.TWId;

public class Brad19 {
    public static void main(String[] args){
        if (TWId.isRightTWId("A123456789")){
            System.out.println("OK");
        }else{
            System.out.println("XX");
        }
    }
}
