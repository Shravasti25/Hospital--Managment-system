package com.HospitalManagment.Hospital.Managment.System.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.HospitalManagment.Hospital.Managment.System.Entities.Patient;
import com.HospitalManagment.Hospital.Managment.System.Repository.PatientRepository;

@RestController
@RequestMapping("/api/patients")
public class PatientController {
    private final PatientRepository repo;

    public PatientController(PatientRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Patient> getAll() {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public Patient getById(@PathVariable Long id) {
        return repo.findById(id).orElse(null);
    }

    @PostMapping
    public Patient save(@RequestBody Patient patient) {
        return repo.save(patient);
    }

    

}