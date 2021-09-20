package org.formacion.decorator;

import java.util.ArrayList;
import java.util.List;

public class LoggerDecorator implements BaseDatos {
	
	private List<String> log = new ArrayList<>();

	@Override
	public void inserta(String registro) {
		log.add("inserta " + registro);
		log.add("lectura");
	}

	@Override
	public List<String> registros() {
		return registros();
	}

	

}
