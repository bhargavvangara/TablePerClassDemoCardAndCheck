package com.jpademo.tableperclass.card.and.check.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "bankcheck")
@Getter
@Setter
@ToString
public class Check extends Payment {
	private String checknumber;

}
