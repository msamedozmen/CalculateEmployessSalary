public class Employee {
    String name;
    String surname;
    int salary;

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public void calculateSalary(int days) {
        if(this.getClass()==Doctor.class){
            switch (((Doctor) this).title){
                case "Fellow":
                    salary = 7*90*days;
                    break;
                case "Resident":
                    salary = 7*70*days;
                    break;
                case "Intern":
                    salary = 7*35*days;
                    break;
            }
        }
        if(getClass()==Nurse.class){
            if(((Nurse) this).year>2018){
                salary = 8*35*days;
            }else{
                salary = 8*40*days;
            }
        }
        if(getClass()==Staff.class){
            salary = 9*30*days;
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }
}
