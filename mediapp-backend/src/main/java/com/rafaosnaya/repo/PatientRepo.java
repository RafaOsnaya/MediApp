package com.rafaosnaya.repo;

import com.rafaosnaya.model.Patient;
import org.springframework.stereotype.Repository;

@Repository
public class PatientRepo {
    public void printPatient(Patient patient) {
        System.out.println(patient);
    }
}
