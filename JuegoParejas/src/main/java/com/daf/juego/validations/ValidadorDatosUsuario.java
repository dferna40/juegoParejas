package com.daf.juego.validations;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.daf.juego.dto.DatosUsuario;

public class ValidadorDatosUsuario implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return DatosUsuario.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		
		DatosUsuario datosUsuario = (DatosUsuario) target;
		
		// la matrícula es obligatoria
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "nombre", "El nombre es obligatorio");
	}

}
