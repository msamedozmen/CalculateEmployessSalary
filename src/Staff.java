public class Staff extends Employee{
    String positionName;

    public Staff(String name, String surname, String positionName) {
        super(name, surname);
        this.positionName = positionName;
    }
}
