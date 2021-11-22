package com.geekbrains;

public class Main {
    public static void main (String[] args){
        Employee employee1 = new Employee("Володин Валерий Владимирович", "Fullstack .NET developer", "vvolodin@edinorog.org", "+79261111142", 250000, 29);
        Employee employee2 = new Employee("Маса Виктория Эрминиовна", "Junior Java developer", "vmasa@edinorog.org", "+79057777777", 100000, 37);
        Employee employee3 = new Employee("Кошка", "кошка", "-", "-", 5000, 1);
        Employee employee4 = new Employee("Перепечко Марина Вадимовна", "секретарь", "volnaya_koshka@edinorog.org", "+79253333333", 80000, 41);
        Employee employee5 = new Employee("Перепечко Иван Константинович", "System Architect", "misterHuy@edinorog.org", "", 280000, 42);

        Employee[] employeeArray = new Employee[5];
        employeeArray[0] = employee1;
        employeeArray[1] = employee2;
        employeeArray[2] = employee3;
        employeeArray[3] = employee4;
        employeeArray[4] = employee5;

        System.out.println("\nСотрудники старше 40 лет: ");
        for (int i = 0; i < employeeArray.length; i++){
            int validAge = employeeArray[i].getAge();
            if (validAge > 40) {
                System.out.println(employeeArray[i].getFullName());
            }
        }
    }


}
