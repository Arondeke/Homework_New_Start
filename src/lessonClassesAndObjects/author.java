package lessonClassesAndObjects;

public class author {
    private String firstName;
    private String lastName;

    public author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName(){
        return this.firstName;
    }
    public String getLasttName(){
        return this.lastName;
    }
}
