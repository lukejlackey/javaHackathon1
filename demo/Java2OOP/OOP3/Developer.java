import java.util.ArrayList;

public class Developer{
        //  ---------- attributes (private/protected) -------------
    private String name;
    private ArrayList<String> languages;
    private ArrayList<Project> projects;
    private int salary;
    private double hoursOfSleep;

    private static int devCount; // static : referring to the class, not instance
    private static int totalIncome; // store all the beginning salary
    private static int totalProjects;

       //  ---------- constructors -------------
    public Developer(){
        this.name= "Anonymous Devloper";
        this.languages = new ArrayList<String>();
        this.projects = new ArrayList<Project>();
        this.salary = 90000;
        this.hoursOfSleep = 4;
        devCount++;
        totalIncome += this.salary; 
    }

    public Developer(String name, int salary, double hoursOfSleep){
        this.name= name;
        this.languages = new ArrayList<String>();
        this.projects = new ArrayList<Project>();
        this.salary = salary;
        this.hoursOfSleep = hoursOfSleep;
        devCount++;
        totalIncome += this.salary; 
    }


    //  ---------- other methods -------------
    public void displayStatus(){
        System.out.println("Name: " + this.name);
        System.out.println("Salary: " + this.salary);
        System.out.println("Hours of sleep: " + this.hoursOfSleep);
        System.out.println("Language: " + this.languages);
        System.out.println("Projects :");
        for(Project eachProject: this.projects){
            eachProject.displayInfo();
        }
    }
    

    public void addLanguage(String language){
        this.languages.add(language);
    }

    public void addProject(Project proj){
        this.projects.add(proj);
        totalProjects++;
    }

    //  ---------- getters & setters -------------
    // getter : return the variable , zero argument
    public String getName(){
        return this.name;
    }

    // setter: no return, with parameters
    public void setName(String name){
        this.name = name;
    }

    // getter : return the variable
    public int getSalary(){
        return this.salary;
    }

    // setter: no return, with parameters
    public void setSalary(int salary){
        this.salary = salary;
    }


    // getter : return the variable
    public double getHoursOfSleep(){
        return this.hoursOfSleep;
    }

    // setter: no return, with parameters
    public void setHoursOfSleep(double hoursOfSleep){
        this.hoursOfSleep = hoursOfSleep;
    }

    // getter : return the variable
    public ArrayList<String> getLanguages(){
        return this.languages;
    }

     // setter: no return, with parameters
    public void setLanguages(ArrayList<String> languages){
        this.languages = languages;
    }

    public ArrayList<Project> getProjects(){
        return this.projects;
    }

    // setter: no return, with parameters
    public void setProjects(ArrayList<Project> projects){
        this.projects = projects;
    }


    public static int getDevCount(){
        return devCount;
    }

    public static int getTotalIncome(){
        return totalIncome;
    }

    public static int getTotalProjects(){
        return totalProjects;
    }


}