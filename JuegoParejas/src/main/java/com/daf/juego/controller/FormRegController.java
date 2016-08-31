package com.daf.juego.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.daf.juego.dto.DatosUsuario;
import com.daf.juego.validations.ValidadorDatosUsuario;

@Controller
@RequestMapping("/")
public class FormRegController {

	@RequestMapping(value = "/vistaFormularioRegistro", method = RequestMethod.GET)
	public String verFormulario() {
		return "vistaFormularioRegistro";
	}
	
	@InitBinder
    protected void initBinder(WebDataBinder binder) {
        binder.setValidator(new ValidadorDatosUsuario()); // registramos el validador
    }
	
	
	@RequestMapping(value = "/manejar", method = RequestMethod.POST)
	public String manejarFormularioYaValidado(@Valid DatosUsuario datosUsuario, BindingResult result) {
		
		//Si hay errores volvemos a la vista del formulario
		if(result.hasErrors()){
			return "vistaFormularioRegistro";
		}
		
		//Si no hay errores, manejamos los datos validados...
		return "registroOk";
	}
	
	@ModelAttribute("datosUsuario")
	public DatosUsuario populateForm() {
	     return new DatosUsuario(); // creamos el bean para que se pueda popular
	}
}