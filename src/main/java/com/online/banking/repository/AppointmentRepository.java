package com.online.banking.userfront.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.online.banking.userfront.domain.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, String>{

}
