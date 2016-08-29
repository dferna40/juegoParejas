package com.daf.juego.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class SobreApliController {

	@RequestMapping(value = { "/sobreAplicacion"}, method = RequestMethod.GET)
	public String productsPage(ModelMap model) {
		return "sobreAplicacion";
	}
}
