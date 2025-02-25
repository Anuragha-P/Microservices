package com.managementsystem;

class Manager extends Employee {
    public Manager(String name, int employeeId) {
        super(name, employeeId);
    }

    @Override
    public String getRole() {
        return "Manager";
    }

    public void assignTask(Task task, Developer developer) {
        developer.receiveTask(task);
    }
}