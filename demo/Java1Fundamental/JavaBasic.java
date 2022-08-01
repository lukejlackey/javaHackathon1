public class JavaBasic{
    // attributes 
    // methods
    public static void main(String[] args){
        System.out.println("Hello Java");
        // 1. compile java (javac & java)

        // ------------- First Java Program ------------

        // 2. variables (int, double, boolean, char, String )
        // Primitive VS Wrapper Class
        String firstName = "Alex";
        String lastName = "Miller";  
        int age = 28;
        boolean isStudent = true;
        double weight = 152.7;
        char grade = 'A';

        System.out.println(firstName + " " + lastName + " : " + age); 
        System.out.println(age);
        System.out.println(isStudent);
        System.out.println(weight);
        System.out.println(Integer.MAX_VALUE);

        // 3. conditionals & ternary
        if(weight< 100){ // condition has to a boolean
            System.out.println("You need to gain some weight!");
        }else{
            System.out.println("You are perfect");
        }

        System.out.println( weight<100 ? "Please gain some weight" :  "You are perfect!"  );
        // (condtion)? (if-true statement) : (else statement)

        // ------------- Cafe Java ------------

        // 4. String (indexOf, format, trim(), .equals )
        String name = firstName.concat(lastName);
        String name2 = firstName + lastName;
        System.out.println(name2);
        System.out.println(name.length());

        // String.format
        String greeting = String.format("Hi %s, you are %d years old", name, 12 );
        System.out.println(greeting);
        System.out.printf("Hi %s, you are %d years old \n", name, age );

        // creating a string
        String firstName1 = "Martha";    
        String firstName2 = new String("Martha");      // memory location
        String firstName3 = "Martha";  

        System.out.println(firstName1 == firstName3);
        System.out.println(firstName1.equals(firstName2));

    }
}









// 8. Fixed Array


// 9. ArrayList


// 10. For-loop & enhanced for-loop


// -------------- Cafe Business Logic --------------

// 7. Casting (implicit & explicit, Null VALUE)


// 11. Maps 