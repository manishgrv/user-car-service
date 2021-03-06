package com.usercar.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Car {
	@Id
	private String carno;
	private String ownerno;
	private String maker;
	private String model;
	private String color;
	private Date rcexp;
	public String getCarno() {
		return carno;
	}
	public void setCarno(String carno) {
		this.carno = carno;
	}
	public String getOwnerno() {
		return ownerno;
	}
	public void setOwnerno(String ownerno) {
		this.ownerno = ownerno;
	}
	public String getMaker() {
		return maker;
	}
	public void setMaker(String maker) {
		this.maker = maker;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Date getRcexp() {
		return rcexp;
	}
	public void setRcexp(Date rcexp) {
		this.rcexp = rcexp;
	}
	public Car(String carno, String ownerno, String maker, String model, String color, Date rcexp) {
		super();
		this.carno = carno;
		this.ownerno = ownerno;
		this.maker = maker;
		this.model = model;
		this.color = color;
		this.rcexp = rcexp;
	}
	public Car() {
		super();
	}

}
