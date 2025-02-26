package com.managementsystem;

public class Main {
	public static void main(String[] args) {
        // Create instances of employees
        Manager manager = new Manager("Alice", 1);
        Developer developer = new Developer("Bob", 2);
        SecurityGuard guard = new SecurityGuard("Charlie", 3);

        // Create EmployeeManager instance
        EmployeeManager employeeManager = new EmployeeManager();
        employeeManager.addEmployee(manager);
        employeeManager.addEmployee(developer);
        employeeManager.addEmployee(guard);

        // View all employees
        employeeManager.viewEmployees();

        // Manager assigns a task to the Developer
        Task task1 = new Task("Develop Feature X", "Develop the new feature for the product.");
        manager.assignTask(task1, developer);

        // Developer works on the assigned task
        developer.workOnTask();

        // Security Guard patrols
        guard.patrol();
    }


}
