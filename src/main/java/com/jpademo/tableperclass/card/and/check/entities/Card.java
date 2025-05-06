package com.jpademo.tableperclass.card.and.check.entities;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class Card extends Payment {
	private String cardnumber;
}
