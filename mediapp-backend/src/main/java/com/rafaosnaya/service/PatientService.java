package com.rafaosnaya.service;

import com.rafaosnaya.model.Patient;
import com.rafaosnaya.repo.PatientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientService {

    @Autowired
    private PatientRepo patientRepo;

    public void printPatient(Patient patient) {

        if (patient.getIdPatient() >= 1){patientRepo.printPatient(patient);}
        else {System.out.println("Patient not found");}
    }
}
