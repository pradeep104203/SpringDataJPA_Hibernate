package com.pradeep.springdata.patientscheduling.repos;

import org.springframework.data.repository.CrudRepository;

import com.pradeep.springdata.patientscheduling.entities.Appointment;

public interface AppointmentRepository extends CrudRepository<Appointment, Long> {

}
