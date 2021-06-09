
public class ProjectTest {
    public static void main(String[] args) {
        Project pitch = new Project("pitch", "desc");
        pitch.elevatorPitch();
        System.out.println(pitch.elevatorPitch());
        System.out.println(pitch.name());
    }
}
