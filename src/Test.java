public class Test{
    public static void main(String[]args){
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Саша", "Отладчик", "sasha@mail.ru", 654-76-80, 30000, 20);
        employees[1] = new Employee("Ваня", "Сантехник", "vanja@mail.ru", 230-54-60, 30000, 30);
        employees[2] = new Employee("Игорь", "Электромеханик", "igor@mail.ru", 456-70-40, 45000, 54);
        employees[3] = new Employee("Влад" , "Монтажник", "vla@mail.ru", 653-35-67, 25000, 45);
        employees[4] = new Employee("Антон","Механик", "anton@mail.ru", 456-54-54, 46000, 65);

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() > 40){
                employees[i].printEmployee();
            }
        }
    }
}