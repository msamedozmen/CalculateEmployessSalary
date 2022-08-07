public class Doctor extends Employee {
    String title;

    public Doctor(String name, String surname, String title) {
        super(name, surname);
        this.title = title;
    }
}
