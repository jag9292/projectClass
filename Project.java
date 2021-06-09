
public class Project {
    public String name;
    public String description;

    public Project() {
    }

    public Project(String name) {
        this.name = name;
    }

    public Project(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String elevatorPitch() {
        return this.name +" : "+ this.description; 
    }

    public String name() {
        return this.name;
    }

    public String description() {
        return this.description;
    }
}
