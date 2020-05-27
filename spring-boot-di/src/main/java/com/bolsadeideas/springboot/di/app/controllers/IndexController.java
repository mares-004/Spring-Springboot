package com.bolsadeideas.springboot.di.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.bolsadeideas.springboot.di.app.models.service.IServicio;

@Controller
public class IndexController
{
	/* using constructor
	@Autowired
	public IndexController(IServicio servicio) {
		this.servicio = servicio;
	}
	*/
	@Autowired
	@Qualifier("miServicioComplejo")
	private IServicio servicio;

	@GetMapping({"/", "", "/index"})
	public String index(Model model)
	{
		model.addAttribute("Objeto", servicio.Operacion());
		return "index";
	}
	
	/*
	 * Using setter method
	@Autowired
	public void setServicio(IServicio servicio) {
		this.servicio = servicio;
	}
	*/

}
