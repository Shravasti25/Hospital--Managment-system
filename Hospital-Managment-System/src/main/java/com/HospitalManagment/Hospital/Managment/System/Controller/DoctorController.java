package com.HospitalManagment.Hospital.Managment.System.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.HospitalManagment.Hospital.Managment.System.Entities.Doctor;
import com.HospitalManagment.Hospital.Managment.System.Repository.DoctorRepository;

@RestController
@RequestMapping("/api/doctors")
public class DoctorController {
    private final DoctorRepository repo;

    public DoctorController(DoctorRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Doctor> getAll() {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public Doctor getById(@PathVariable Long id) {
        return repo.findById(id).orElse(null);
    }

    @PostMapping
    public Doctor save(@RequestBody Doctor doctor) {
        return repo.save(doctor);
    }

   
}