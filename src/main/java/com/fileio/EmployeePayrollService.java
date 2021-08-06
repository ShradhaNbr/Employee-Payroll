package com.fileio;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeePayrollService {
    static ArrayList<com.fileio.EmployeePayroll> employeePayroll = new ArrayList<>();
    public EmployeePayrollService(ArrayList<com.fileio.EmployeePayroll> employeePayroll) {
    }

    public static void main(String[] args) {
        EmployeePayrollService employeePayrollService = new EmployeePayrollService(employeePayroll);
        Scanner consoleInputReader = new Scanner(System.in);
        employeePayrollService.readEmployeePayroll(consoleInputReader);
        employeePayrollService.writeEmployeePayroll();
    }

    private void writeEmployeePayroll() {
        System.out.println("Writing employee payroll to console" + employeePayroll);
    }

    private void readEmployeePayroll(Scanner consoleInputReader) {
        System.out.println("Enter employee id");
        int id = consoleInputReader.nextInt();
        System.out.println("Enter employee name");
        String name = consoleInputReader.next();
        System.out.println("Enter employee salary");
        double salary = consoleInputReader.nextDouble();
        employeePayroll.add(new com.fileio.EmployeePayroll(id, name, salary));
    }
}
