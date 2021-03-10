package com.pradeep.springdata.patientscheduling.repos;

import org.springframework.data.repository.CrudRepository;

import com.pradeep.springdata.patientscheduling.entities.Doctor;

public interface DoctorRepository extends CrudRepository<Doctor, Long> {

}
