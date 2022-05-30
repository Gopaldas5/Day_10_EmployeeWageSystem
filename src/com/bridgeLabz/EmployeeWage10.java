package com.bridgeLabz;

import java.util.Random;

public class EmployeeWage10 {
    public static void main(String[] args) {
        System.out.println("Welcome to the employee wage computation on master branch");
        int IS_ABSENT_TODAY = 0;
        Random random = new Random();
        int employeeAttendanceCheck = random.nextInt(2);

        if (employeeAttendanceCheck  == IS_ABSENT_TODAY) {
            System.out.println("Employee is absent today");
        } else {
            System.out.println("Employee is Present today");
        }
    }
}
