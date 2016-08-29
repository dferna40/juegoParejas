package com.daf.juego.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.daf.juego.dto.DatosUsuario;

@Controller
@RequestMapping("/daf")
public class FormRegController {

	@RequestMapping(value = { "/formularioRegistro"}, method = RequestMethod.GET)
	public String verFormulario(ModelMap model) {
		return "vistaFormularioRegistro";
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

	@RequestMapping(value = { "/products"}, method = RequestMethod.GET)
	public String productsPage(ModelMap model) {
		return "products";
	}

	@RequestMapping(value = { "/contactus"}, method = RequestMethod.GET)
	public String contactUsPage(ModelMap model) {
		return "contactus";
	}
}