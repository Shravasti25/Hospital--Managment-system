package com.HospitalManagment.Hospital.Managment.System.Repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.HospitalManagment.Hospital.Managment.System.Entities.Appointment;

public interface AppoinmentRepository extends JpaRepository<Appointment, Long> {
    // Search appointments by patient name
    List<Appointment> findByPatientNameContainingIgnoreCase(String patientName);

    // Search appointments by doctor name
    List<Appointment> findByDoctorNameContainingIgnoreCase(String doctorName);

    // Search appointments by appointment date (exact date)
    List<Appointment> findByAppointmentTimeBetween(LocalDateTime start, LocalDateTime end);
}