import java.util.ArrayList;
public class DeveloperTest{
    public static void main(String[] args){
        System.out.println("---- Developer Test ----");
        Developer dev1 = new Developer("Alex Miller", 100000, 6);
        dev1.addLanguage("Python");
        dev1.addLanguage("Java");
        
        // create 2 projects to put into the dev1
        Project project1 = new Project();
        project1.title = "iShelter";
        project1.language = "Python";
        dev1.addProject(project1);
        dev1.displayStatus();


        Developer dev2 = new Developer();
        dev2.displayStatus();



    }
}