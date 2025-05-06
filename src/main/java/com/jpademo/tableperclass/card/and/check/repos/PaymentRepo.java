package com.jpademo.tableperclass.card.and.check.repos;

import org.springframework.data.repository.CrudRepository;

import com.jpademo.tableperclass.card.and.check.entities.Payment;

public interface PaymentRepo extends CrudRepository<Payment, Integer> {
	// No additional methods needed for basic CRUD operations

}
