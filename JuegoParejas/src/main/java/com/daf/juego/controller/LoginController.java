package com.daf.juego.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.daf.juego.dto.DatosUsuario;
import com.daf.juego.services.UsuarioService;

@Controller
@RequestMapping("/")
public class LoginController {

	@Autowired
	UsuarioService service;
	
	@RequestMapping(value = { "/login"}, method = RequestMethod.GET)
	public String paginaLogin(ModelMap model) {
		return "login";
	}
	
	@RequestMapping(value = "/manejarLogin", method = RequestMethod.POST)
	public String manejarFormularioYaValidado(@Valid DatosUsuario datosUsuario, BindingResult result) {
		
		//Si hay errores volvemos a la vista del formulario
		if(result.hasErrors()){
			return "login";
		}
		
		//Si no hay errores, manejamos los datos validados...
		return "loginOk";
	}
	
	@ModelAttribute("datosUsuario")
	public DatosUsuario populateForm() {
	     return new DatosUsuario(); // creamos el bean para que se pueda popular
	}
}