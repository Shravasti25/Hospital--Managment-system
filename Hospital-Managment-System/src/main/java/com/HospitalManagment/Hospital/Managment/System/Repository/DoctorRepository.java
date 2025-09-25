package com.HospitalManagment.Hospital.Managment.System.Repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.HospitalManagment.Hospital.Managment.System.Entities.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {}