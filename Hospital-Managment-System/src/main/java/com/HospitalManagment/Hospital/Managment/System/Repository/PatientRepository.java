package com.HospitalManagment.Hospital.Managment.System.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.HospitalManagment.Hospital.Managment.System.Entities.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long> {}

