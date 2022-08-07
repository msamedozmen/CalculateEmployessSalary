import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Employee employees[] = new Employee[10];
        Random r = new Random();
        for (int i=0;i<10;i++){
            Employee e = employees[i];
            int random = r.nextInt(3);
            switch (random){
                case 0:
                    String positions[] = new String[]{"Fellow","Resident","Intern"};
                    String position = positions[r.nextInt(3)];
                    e = new Doctor("NNNNN","SSSS",position);
                    break;
                case 1:
                    int year = r.nextInt(11);
                    e = new Nurse("NNNNN","SSSS",2010+year);
                    break;
                case 2:
                    e = new Staff("NNNNN","SSSS","PPPPP");
                    break;
            }
            e.calculateSalary(25);
            System.out.println("Employee "+(i+1)+" is a " +e.getClass().toString().split(" ")[1]+
                    "\nName: NNNNN\n" +
                    "Surname: SSSS \n" +
                    "Salary: "+e.salary);
        }

    }
}
