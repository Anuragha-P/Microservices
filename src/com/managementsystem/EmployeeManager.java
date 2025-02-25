package com.managementsystem;

import java.util.*;
class EmployeeManager {
    private List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void viewEmployees() {
        for (Employee employee : employees) {
            System.out.println("Employee ID: " + employee.employeeId + ", Name: " + employee.name + ", Role: " + employee.getRole());
        }
    }
}