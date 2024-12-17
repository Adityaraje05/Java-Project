package com.service;

import com.daolayer.DAO;
import com.pojo.Patient;

import java.util.ArrayList;

public class PatientServiceImpl implements PatientI {
    private ArrayList<Patient> patients = new ArrayList<>(); // Assuming a list to hold patient data

    @Override
    public void regiter(Patient p1) {
        DAO.insertPatientD(p1);
    }

    @Override
    public boolean IsRegisted(Patient p) {
        return DAO.checkId(p.getPid());
    }

    @Override
    public void updateDetails(Patient updatedPatient) throws Exception {
        boolean success = DAO.updatePatientDetails(updatedPatient);
        if (success) {
            System.out.println("Patient details updated successfully!");
        } else {
            System.out.println("Failed to update patient details. Patient not found.");
        }
    }

    @Override
    public void deleteEntry(int id ) {
        boolean success = DAO.deletePatient(id);
        if (success) {
            System.out.println("Patient deleted successfully!");
        } else {
            System.out.println("Failed to delete patient. Patient not found.");
        }
    }


    @Override
    public void viewData() {
        try {
            ArrayList<Patient> patientList = DAO.fetchPatientData();
            if (patientList.isEmpty()) {
                System.out.println("No patients found.");
            } else {
                for (Patient patient : patientList) {
                    System.out.println(patient);
                }
            }
        } catch (Exception e) {
            System.out.println("Error fetching data: " + e.getMessage());
        }
    }

    @Override
    public ArrayList<Patient> fetchPatientData() {
        try {
            return DAO.fetchPatientData();
        } catch (Exception e) {
            System.out.println("Error fetching patient data: " + e.getMessage());
            return new ArrayList<>(); // Return an empty list in case of an error
        }
    }
}
