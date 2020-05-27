package com.bolsadeideas.springboot.di.app.models.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component("miServicioPrincipal")
//@Primary
public class MiServicioComplejo implements IServicio
{
	@Override
	public String Operacion()
	{
		return "Ejecutando algun proceso importante complicado Autowired .  . . .";
	}

}
