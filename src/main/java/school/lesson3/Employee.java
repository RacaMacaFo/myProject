package school.lesson3;

public class Employee {
    private String name;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    public Employee(String name , String position , String email , String phoneNumber , int salary , int age ){
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }
    public String toString(){
        return(name+ "\n-" +position+ "\n-" +email+ "\n-" +phoneNumber+ "\n-" +salary+ "\n-" +age);
    }
    public int getAge(){
        return age;
    }

    public static void main(String[] args) {
        Employee[]corpZBS = new Employee[5];
        corpZBS[0] = new Employee("Jesus Cris","Creator","godbless@gmail.com", "80637777777",30000 , 33);
        corpZBS[1] = new Employee("Nikola Tesla","Inventor","N.Tesla@gmail.com", "80631112233",20000 , 86);
        corpZBS[2] = new Employee("Genghis Khan","Conqueror","GenghisCoolMan@gmail.com", "80632223344",10000 , 65);
        corpZBS[3] = new Employee("Justin Bieber ","PopStar","PopsaHernya@gmail.com", "80633334455",1000 , 27);
        corpZBS[4] = new Employee("Angelka","WebCamModel","OnlyFans@gmail.com", "80634445566",41000 , 21);
        for (Employee employee : corpZBS)
            if (employee.getAge()>40)
                System.out.println(employee);
    }
}