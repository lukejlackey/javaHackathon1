class VoiceMessageTest{
    public static void main(String[] args){
        VoiceMessageUtil alexMachine = new VoiceMessageUtil();
        System.out.println(alexMachine.greeting());

        System.out.println(alexMachine.greeting("Alex"));

        System.out.println(alexMachine.greeting(10));

        System.out.println(alexMachine.getCurrentDate());
    }
}