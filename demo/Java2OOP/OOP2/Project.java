public class Project{
    //  ---------- attributes (private/protected) -------------
    private String title;
    private String language;

    //  ---------- constructors -------------
    public Project(){
        this.title = "Untitled Project";
        this.language="Unknown Language";
    }

    public Project(String title, String language){
        this.title = title;
        this.language = language;
    }


    //  ---------- other methods -------------
    public void displayInfo(){
        System.out.println("Title: " + this.title + " | Language : " + this.language);
    }

    //  ---------- getters & setters -------------
    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return this.title;
    }

    public void setLanguage(String language){
        this.language = language;
    }

    public String getLanguages(){
        return this.language;
    }

}