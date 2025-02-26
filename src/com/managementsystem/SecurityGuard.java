package com.managementsystem;

//SecurityGuard class: Handles security-related tasks
class SecurityGuard extends Employee implements ISecurity {
 public SecurityGuard(String name, int employeeId) {
     super(name, employeeId);
 }

 @Override
 public String getRole() {
     return "Security Guard";
 }

 @Override
 public void patrol() {
     System.out.println("Security Guard " + name + " is patrolling.");
 }
}