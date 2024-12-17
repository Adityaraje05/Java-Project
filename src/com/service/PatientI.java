package com.service;

import com.pojo.Patient;

import java.util.ArrayList;

public interface PatientI {
   // void regiter(Patient p);
   void regiter(Patient p1);

    boolean IsRegisted(Patient p);

    void updateDetails(Patient updatedPatient) throws Exception;

    void deleteEntry(int id);

    void viewData();

    ArrayList<Patient> fetchPatientData() throws Exception;
}
