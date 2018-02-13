package com.example.prototype;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter Employee Id: ");
            int eid = Integer.parseInt(br.readLine());
            System.out.print("\n");

            System.out.print("Enter Employee Name: ");
            String ename = br.readLine();
            System.out.print("\n");

            System.out.print("Enter Employee Last name: ");
            String edesignation = br.readLine();
            System.out.print("\n");

            System.out.print("Enter Employee Address: ");
            String eaddress = br.readLine();
            System.out.print("\n");

            System.out.print("Enter Employee Salary: ");
            double esalary = Double.parseDouble(br.readLine());
            System.out.print("\n");

            EmployeeRecord e1 = new EmployeeRecord(eid, ename, edesignation, esalary);

            e1.showRecord();
            System.out.println("\n");
            EmployeeRecord e2 = (EmployeeRecord) e1.getClone();
            e2.showRecord();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
