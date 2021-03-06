package com.bridgeLabz;

import java.util.Random;

public class EmployeeWage10 {

    private static final int IS_PART_TIME = 1;
    public static  final int IS_FULL_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int NUM_OF_WORKING_DAYS = 2;
    public static final int MAX_HRS_IN_MONTH = 10;


    public static void main(String[] args) {
        System.out.println("Welcome to the employee wage computation on master branch");
        Random random = new Random();
            int empHrs = 0;
            int empWage = 0;
            int totalWorkingDays = 0;
            int totalEmpHrs = 0;

            while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS) {
            totalWorkingDays++;
            int employeeAttendanceCheck = random.nextInt(2);
            empHrs = switch (employeeAttendanceCheck) {
                case IS_PART_TIME -> 4;
                case IS_FULL_TIME -> 8;
                default -> 0;
            };
            totalEmpHrs += empHrs;
            System.out.println("Working days: " + totalWorkingDays + "Employee working hours: " + empHrs);
        }
        int totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;
        System.out.println("Total Employee wage : " + totalEmpWage);
        }
    }
