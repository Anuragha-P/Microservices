package com.managementsystem;

import java.util.ArrayList;
import java.util.List;

// 1. Single Responsibility Principle (SRP): Each class has one responsibility

// Abstract base class for all Employees
abstract class Employee {
    protected String name;
    protected int employeeId;

    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public abstract String getRole();
}













