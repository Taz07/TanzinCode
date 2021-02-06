package com.JavaCore;

public class Employee {

    public String name;

    public double salary;

    public Employee (String empName) {
        name = empName;
    }

    public void setSalary(double empSal) {
        salary = empSal;
    }

    public void printEmp() {
        System.out.println("Employee name  : " + name );
        System.out.println("salary :" + salary);
    }

    public static void main(String args[]) {
        Employee empOne = new Employee("Tanzin Chowdhury");
        empOne.setSalary(100000);
        empOne.printEmp();
    }
}
