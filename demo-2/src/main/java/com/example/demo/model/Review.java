package com.example.demo.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.Id;


@Entity
@Table(name="hotel_review")
public class Review {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private String id;
	
	private int rate;
	private String comment;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="rating_date")
	private Date ratingDate;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="hotel_id")
	private Hotel hotel;
}
