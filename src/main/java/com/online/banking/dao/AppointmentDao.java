package com.online.banking.userfront.dao;

import java.util.List;

import com.online.banking.userfront.domain.Appointment;

public interface AppointmentDao {
	
	List<Appointment> findAll();
	Appointment save(Appointment appointment);
	Appointment findOne(long id);
}
