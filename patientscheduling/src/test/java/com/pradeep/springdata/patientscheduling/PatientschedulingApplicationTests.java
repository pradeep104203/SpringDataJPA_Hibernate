package com.pradeep.springdata.patientscheduling;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.pradeep.springdata.patientscheduling.entities.Appointment;
import com.pradeep.springdata.patientscheduling.entities.Doctor;
import com.pradeep.springdata.patientscheduling.entities.Insurance;
import com.pradeep.springdata.patientscheduling.entities.Patient;
import com.pradeep.springdata.patientscheduling.repos.AppointmentRepository;
import com.pradeep.springdata.patientscheduling.repos.DoctorRepository;
import com.pradeep.springdata.patientscheduling.repos.PatientRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PatientschedulingApplicationTests {

	@Autowired
	DoctorRepository doctorRepository;

	@Autowired
	PatientRepository patientRepository;

	@Autowired
	AppointmentRepository appointmentRepository;

	@Test
	public void testCreateDoctor() {

		List<Doctor> list = new ArrayList<>();
		for (int i = 0; i < 50; i++) {
			Doctor doctor2 = new Doctor();
			// doctor2.setId(4L);
			doctor2.setFirstName("pradeep2");
			doctor2.setLastName("Thippireddy2");
			doctor2.setSpeciality("All2");

			list.add(doctor2);
		}

		doctorRepository.saveAll(list);
	}

	@Test
	public void testCreatePatient() {

		Patient patient = new Patient();
		patient.setFirstName("Doug");
		patient.setLastName("Bailey");
		patient.setPhone("123456");

		Insurance insurance = new Insurance();
		insurance.setProviderName("Blue Cross Blue Shield");
		insurance.setCopay(20d);

		patient.setInsurance(insurance);

		Doctor doctor = doctorRepository.findById(1L).get();
		List<Doctor> doctors = Arrays.asList(doctor);
		patient.setDoctors(doctors);

		patientRepository.save(patient);

	}

	@Test
	public void testCreateAppointment() {

		Appointment appointment = new Appointment();
		Timestamp appointmentTime = new Timestamp(new Date().getTime());
		appointment.setAppointmentTime(appointmentTime);
		appointment.setReason("I have a problem");
		appointment.setStarted(true);

		appointment.setPatient(patientRepository.findById(1l).get());
		appointment.setDoctor(doctorRepository.findById(1L).get());

		appointmentRepository.save(appointment);
	}

}
