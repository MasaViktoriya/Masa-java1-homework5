package com.geekbrains;

public class Employee {
    private String fullName;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String fullName, String position, String email, String phone, int salary, int age){
        this.setFullName(fullName);
        this.setPosition(position);
        this.setEmail(email);
        this.setPhone(phone);
        this.setSalary(salary);
        this.setAge(age);
        printAllFields();


    }
    public void printAllFields(){
        System.out.println("Информация о сотруднике: ФИО:"+ this.getFullName() + ", должность: " + this.getPosition() + ", возраст: " + this.getAge() + ", зарплата: " + this.getSalary() + ", e-mail: " + this.getEmail() + ", телефон: " + this.getPhone());
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
