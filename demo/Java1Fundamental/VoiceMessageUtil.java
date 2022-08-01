import java.util.*;

class VoiceMessageUtil{
    // 5. methods (overloading methods)
    // 6. dependency injection (using methods in another file)
    // -------------- Alfred Bot ------------------

    public String greeting(){
        return "Hi, anonymous!";
    }

    public String greeting(String name){
        return "Hi, "+ name;
    }

    public String greeting(int count){
        return "Hi, count: "+ count;
    }

    public String getCurrentDate(){
        Date today = new Date();
        return "Today is "+ today;
    }

    // 10. For-loop & enhanced for-loop
    public int totalMessages(int[] numArr){
        int sum=0;
        for(int i=0; i<numArr.length; i++){
            sum += numArr[i];
        }
        return sum;
    }

    public void printMessages(String[] msgArr){
        // enhanced for-loop
        for(String msg: msgArr){
            System.out.println(msg);
        }

        // traditional for-loop
        for(int i=0; i<msgArr.length; i++){
            System.out.println(msgArr[i]);
        }
    }

    public void printMessages(ArrayList<String> msgArr){
        // enhanced for-loop
        for(String msg: msgArr){
            System.out.println(msg);
        }

        // traditional for-loop
        for(int i=0; i<msgArr.size(); i++){
            System.out.println(msgArr.get(i));
        }
    }



}