package com.rafaosnaya.controller;

import com.rafaosnaya.model.Patient;
import com.rafaosnaya.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/patients")
public class PatientController {

    @Autowired
    private PatientService patientService;

    @GetMapping
    public Patient printPatient() {

        Patient patient = new Patient();
        patient.setIdPatient(2);
        patient.setFirstName("Rafael");
        patientService.printPatient(patient);
        return patient;
    }

}
