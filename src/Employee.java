public class Employee {
    private String name;
    private String position;
    private String email;
    private int phone;
    private int salary;
    private int age;

    public Employee(String _name, String _position, String _email, int _phone, int _salary, int _age){
        name = _name;
        position = _position;
        email = _email;
        phone = _phone;
        salary = _salary;
        age = _age;
    }

    public int getAge(){
        return age;
    }

    public void printEmployee(){
        System.out.printf("Параметры сотрудника: \nИмя- %s \nДолжность- %s \nЭлектронная почта- %s \nТелефон- %d " +
                " \nОплата труда- %d \nВозраст- %d", name, position, email, phone, salary, age);
    }
}
