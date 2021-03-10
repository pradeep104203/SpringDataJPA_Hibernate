package com.pradeep.springdata.patientscheduling.repos;

import org.springframework.data.repository.CrudRepository;

import com.pradeep.springdata.patientscheduling.entities.Patient;

public interface PatientRepository extends CrudRepository<Patient, Long> {

}
