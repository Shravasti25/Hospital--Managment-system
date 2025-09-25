package com.HospitalManagment.Hospital.Managment.System.Controller;


import org.springframework.web.bind.annotation.*;

import com.HospitalManagment.Hospital.Managment.System.Entities.Appointment;
import com.HospitalManagment.Hospital.Managment.System.Repository.AppoinmentRepository;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/appointments")
public class AppointmentController {

    private final AppoinmentRepository repo;

    public AppointmentController(AppoinmentRepository repo) {
        this.repo = repo;
    }

    // Search appointments by patient name
    @GetMapping("/search/patient")
    public List<Appointment> searchByPatient(@RequestParam String name) {
        return repo.findByPatientNameContainingIgnoreCase(name);
    }

    // Search appointments by doctor name
    @GetMapping("/search/doctor")
    public List<Appointment> searchByDoctor(@RequestParam String name) {
        return repo.findByDoctorNameContainingIgnoreCase(name);
    }

    // Search appointments between 2 times
    @GetMapping("/search/date")
    public List<Appointment> searchByDate(@RequestParam String start,
                                          @RequestParam String end) {
        LocalDateTime startDate = LocalDateTime.parse(start);
        LocalDateTime endDate = LocalDateTime.parse(end);
        return repo.findByAppointmentTimeBetween(startDate, endDate);
    }
}