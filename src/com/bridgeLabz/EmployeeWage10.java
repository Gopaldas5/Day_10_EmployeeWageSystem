package com.bridgeLabz;

import java.util.Random;

public class EmployeeWage10 {

    private static final double IS_PART_TIME = 1;
    private static int IS_ABSENT_TODAY = 0;
    private static int IS_FULL_TIME = 1;
    private static int EMP_RATE_PER_HOUR = 20;
    public static void main(String[] args) {

        System.out.println("Welcome to the employee wage computation on master branch");

        int empHrs = 0;
        int empWage = 0;
        Random random = new Random();
        int employeeAttendanceCheck = random.nextInt(2);
        if (employeeAttendanceCheck == IS_PART_TIME)
            empHrs = 4;
        else if (employeeAttendanceCheck == IS_FULL_TIME)
            empHrs = 8;
        else
            empHrs = 0;
        empWage = empHrs * EMP_RATE_PER_HOUR;
        System.out.println("Employee wage : "+empWage);;
    }
}
