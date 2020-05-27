package com.bolsadeideas.springboot.di.app.models.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


//@Component("miServicioSimple")
public class MiServicio implements IServicio
{
	@Override
	public String Operacion()
	{
		return "Ejecutando algun proceso importante simple Autowired . . .";
	}

}
