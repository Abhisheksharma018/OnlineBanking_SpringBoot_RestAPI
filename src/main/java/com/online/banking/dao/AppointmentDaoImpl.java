package com.online.banking.userfront.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.online.banking.userfront.domain.Appointment;
import com.online.banking.userfront.repository.AppointmentRepository;

@Repository
public class AppointmentDaoImpl implements AppointmentDao{

	@Autowired
	private AppointmentRepository appointmentRepo;
	
	@Override
	public List<Appointment> findAll() {
		// TODO Auto-generated method stub
		return appointmentRepo.findAll();
	}

	@Override
	public Appointment save(Appointment appointment) {
		// TODO Auto-generated method stub
		return appointmentRepo.save(appointment);
	}

	@Override
	public Appointment findOne(long id) {
		// TODO Auto-generated method stub
		return appointmentRepo.getOne(String.valueOf(id));
	}

}
