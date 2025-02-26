package com.managementsystem;

import java.util.ArrayList;
import java.util.List;

//Developer class: Handles task management and task execution
class Developer extends Employee implements ITaskable {
 private List<Task> tasks = new ArrayList<>();

 public Developer(String name, int employeeId) {
     super(name, employeeId);
 }

 @Override
 public String getRole() {
     return "Developer";
 }

 @Override
 public void receiveTask(Task task) {
     tasks.add(task);
 }

 public void workOnTask() {
     if (!tasks.isEmpty()) {
         Task task = tasks.remove(0);
         System.out.println("Developer " + name + " is working on " + task.getTitle());
     } else {
         System.out.println("Developer " + name + " has no tasks.");
     }
 }
}