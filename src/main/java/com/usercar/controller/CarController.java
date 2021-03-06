package com.usercar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.usercar.model.Car;
import com.usercar.model.CarPuc;
import com.usercar.model.CarServicing;
import com.usercar.model.Trip;
import com.usercar.service.CarService;

@RestController
public class CarController {

	@Autowired
	private CarService carservice;
	
	@RequestMapping(method=RequestMethod.POST,path="/addcar")
	public ResponseEntity<?> addCar(@RequestHeader(name="Authorization")String token,@RequestBody Car car)
	{
		return new ResponseEntity<>(carservice.addCar(token, car),HttpStatus.OK);
	}
	@RequestMapping(method=RequestMethod.POST,path="/addservicing/{carno}")
	public ResponseEntity<?> addServicing(@PathVariable("carno")String carno,@RequestHeader(name="Authorization")String token,@RequestBody CarServicing carserv)
	{
		return new ResponseEntity<>(carservice.addCarService(token, carno, carserv),HttpStatus.OK);
	}
	@RequestMapping(method=RequestMethod.POST,path="/addpuc/{carno}")
	public ResponseEntity<?> addPuc(@PathVariable("carno")String carno,@RequestHeader(name="Authorization")String token,@RequestBody CarPuc carpuc)
	{
		return new ResponseEntity<>(carservice.addCarPuc(token, carno, carpuc),HttpStatus.OK);
	}
	@RequestMapping(method=RequestMethod.POST,path="/addtrip/{carno}")
	public ResponseEntity<?> addTrip(@PathVariable("carno")String carno,@RequestHeader(name="Authorization")String token,@RequestBody Trip carTrip)
	{
		return new ResponseEntity<>(carservice.addCarTrip(token, carno, carTrip),HttpStatus.OK);
	}
	@RequestMapping(method=RequestMethod.GET,path="/viewcar/{carno}")
	public ResponseEntity<?> viewCar(@PathVariable("carno")String carno,@RequestHeader(name="Authorization")String token)
	{
		return new ResponseEntity<>(carservice.viewCar(token, carno),HttpStatus.OK);
	}
	@RequestMapping(method=RequestMethod.GET,path="/viewallcars")
	public ResponseEntity<?> viewAll(@RequestHeader(name="Authorization")String token)
	{
		return new ResponseEntity<>(carservice.viewCars(),HttpStatus.OK);
	}
}
