import java.util.ArrayList;

class VoiceMessageTest{
    public static void main(String[] args){
        VoiceMessageUtil alexMachine = new VoiceMessageUtil();
        System.out.println(alexMachine.greeting());
        System.out.println(alexMachine.greeting("Alex"));
        System.out.println(alexMachine.greeting(10));
        System.out.println(alexMachine.getCurrentDate());

        // 8. Fixed Array
        int[] messagesPerDay1 = new int[5]; // [ 0,0,0,0,0] length: 5
        messagesPerDay1[0] = 5;
        messagesPerDay1[1] = 8;
        messagesPerDay1[2] = 6;

        int[] messagesPerDay2 = { 5, 8, 6}; // length :3 

        System.out.println("Total messages:  " +alexMachine.totalMessages(messagesPerDay1));

        String[] messages = {"Please call back!", "Make sure you install jdk", "Help debug please!" };
        alexMachine.printMessages(messages);
        
        // 9. Dynamic array: ArrayList
        // ArrayList<Data Type> varName = new ArrayList<Data Type>();
        ArrayList<String> messageArrayList = new ArrayList<String>();
        messageArrayList.add("Finish Alfred bot");
        messageArrayList.add("Finish Cafe Business Logic");
        messageArrayList.add("Read ahead for OOP");

        alexMachine.printMessages(messageArrayList);

        // type casting
        int days = 7;
        double cost = 10.01; // days * cost

        // no loss of data in conversion: implicit casting
        double totalCost = days * cost; // cost: double;  day: int 7 -> double 7.00
        System.out.println(totalCost);


        // loss of data in conversion: explicit casting

        int roundedTotalCost = days * (int) cost;    //  day: int ; cost: double --> int;   10.01 --> 10
        System.out.println(roundedTotalCost);



    }
}