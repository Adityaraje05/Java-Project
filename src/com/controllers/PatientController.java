package com.controllers;

import java.util.ArrayList;
import java.util.Scanner;

import com.pojo.Patient;
import com.service.PatientServiceImpl;

public class PatientController {
    public static void main(String[] args) {
        PatientServiceImpl pp = new PatientServiceImpl();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for registration \nEnter 2 to check Entry \nEnter 3 to fetch the Entries \nEnter 4 to update the Entries \nEnter 5 to delete the Entries \nEnter 6 to view the Entries ");
        int n = sc.nextInt();
        do {
            switch (n) {
                case 1:

                    System.out.println("Enter Patients id,name,age,gender");
                    Patient p = new Patient(sc.nextInt(), sc.next(), sc.nextInt(), sc.next());
                    pp.regiter(p);
                    break;
                case 2:
                    System.out.println("Enter Patients id");
                    Patient p1 = new Patient(sc.nextInt());
                    if (pp.IsRegisted(p1)) {
                        System.out.println("Patient already exist");
                    } else {
                        System.out.println("**Please Register Patient Details **");
                        System.out.println("Enter Patient ID,name,age,gender");
                        Patient newpatient = new Patient(sc.nextInt(), sc.next(), sc.nextInt(), sc.next());
                        pp.regiter(newpatient);
                    }
                    break;
                case 3:
                    try {
                        ArrayList<Patient> al = pp.fetchPatientData();
                        for (Patient patient : al) {
                            System.out.println(patient);
                        }
                    } catch (Exception e) {

                    }
                    break;
                case 4:
                    int updateId = sc.nextInt();
                    System.out.println("Enter new Name, Age, Gender:");
                    Patient updatedPatient = new Patient(updateId, sc.next(), sc.nextInt(), sc.next());
                    try {
                        pp.updateDetails(updatedPatient);
                    } catch (Exception e) {
                        System.out.println("Error updating details: " + e.getMessage());
                    }
                    break;

                case 5:
                    System.out.println("Enter Patient ID");
                    int deleteId = sc.nextInt();
                    pp.deleteEntry(deleteId);
                    break;

                case 6:
                    pp.viewData();
                    break;

            }

        } while (n != 6);

    }
}
