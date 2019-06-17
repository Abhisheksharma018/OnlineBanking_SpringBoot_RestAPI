package com.online.banking.userfront.service;

import java.util.List;

import com.online.banking.userfront.domain.Appointment;

public interface AppointmentService {

	Appointment createAppointment(Appointment appointment);

    List<Appointment> findAll();

    Appointment findAppointment(Long id);

    void confirmAppointment(Long id);
}
