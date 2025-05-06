package com.jpademo.tableperclass.card.and.check;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.jpademo.tableperclass.card.and.check.entities.Card;
import com.jpademo.tableperclass.card.and.check.entities.Check;
import com.jpademo.tableperclass.card.and.check.entities.Payment;
import com.jpademo.tableperclass.card.and.check.repos.PaymentRepo;

@SpringBootTest
class TablePerClassDemoCardAndCheckApplicationTests {
	@Autowired
	private PaymentRepo paymentRepo;

	@Test
	void saveCardAndCheck() {
		// Create instances of Card and Check
		Card card = new Card();
		card.setCardnumber("1234-5678-9012-3456");
		card.setAmount(100.0);

		Check check = new Check();
		check.setChecknumber("CHK123456");
		check.setAmount(200.0);

		// Save the payments
		paymentRepo.save(card);
		paymentRepo.save(check);
		
		System.out.println("Card and Check saved successfully!");
	}
	@Test
	void findAllPayments() {
		// Fetch all payments
		Iterable<Payment> payments = paymentRepo.findAll();
		
		// Print the payments
		for (Payment payment : payments) {
			System.out.println(payment);
		}
	}

}
