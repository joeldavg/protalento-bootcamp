package ar.com.educacionit.crud;

import java.util.HashMap;
import java.util.Map;

public class EjecutableBuilder {

	private static Map<Integer, Ejecutable> opcionesMap = crearOpciones();
	
	private static Map<Integer, Ejecutable> crearOpciones() {
		
		Map<Integer, Ejecutable> opciones = new HashMap<>();
		
		opciones.put(1, new Alta());
		opciones.put(2, new Baja());
		opciones.put(3, new Modificar());
		opciones.put(4, new Eliminar());
		
		return opciones;
	}
	
	public static Ejecutable getEjecutable(Integer opcionBuscada) throws Exception {
	
		if (opcionesMap.containsKey(opcionBuscada)) {
			return opcionesMap.get(opcionBuscada);
		}
		
		throw new Exception("No exite ejecutable asociado a la clave: " + opcionBuscada);
	}
}
