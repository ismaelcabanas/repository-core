package org.icabanas.jee.api.integracion.dao.util;

import org.apache.commons.lang.Validate;

/**
 * Clase de utilidad para operaciones sobre la paginaci�n. 
 * 
 * <br/><br/>
 * <b>Responsabilidad</b> :  Expone m�todos de utilidad para la paginaci�n de registros.
 * 
 * @author f009994r
 *
 */
public final class PaginacionUtils {

	
	private PaginacionUtils() {}

	/**
	 * Calcula la posici�n del primer registro de una p�gina determinada en un listado de registros paginados.
	 * 
	 * @param paginaActual
	 * 		P�gina actual
	 * @param numeroRegistrosPorPagina
	 * 		N�mero de registros por p�gina.
	 * 
	 * @return
	 * 		La posici�n del primer registro de una p�gina en un listado de registros paginados.
	 */
	public static int calculaPrimerRegistro(int paginaActual,
			int numeroRegistrosPorPagina) {		
		int primerRegistro;
		
		Validate.isTrue(paginaActual >= 1, "El par�metro paginaActual debe ser mayor o igual que 1.");
		Validate.isTrue(numeroRegistrosPorPagina >= 1, "El par�metro numeroRegistrosPorPagina debe ser mayor o igual que 1.");
		
		primerRegistro = ((paginaActual - 1) * numeroRegistrosPorPagina) + 1;
		
		return primerRegistro;
	}

	/**
	 * Calcula el n�mero de p�ginas que habr� en un listado de registros.
	 * 
	 * @param numeroRegistrosPorPagina
	 * 		N�mero de registros por p�gina
	 * @param numeroTotalRegistros
	 * 		N�mero total de registros.
	 * 
	 * @return
	 * 		El n�mero total de p�ginas de un listado de registros.
	 */
	public static int calculaTotalPaginas(int numeroRegistrosPorPagina,
			int numeroTotalRegistros) {
		
		Validate.isTrue(numeroRegistrosPorPagina >=1,  "El par�metro numeroRegistrosPorPagina debe ser >= que 1.");
		Validate.isTrue(numeroTotalRegistros >=0,  "El par�metro numeroTotalRegistros debe ser >= que 0.");
		
		int numeroTotalPaginas;
		if(numeroTotalRegistros % numeroRegistrosPorPagina == 0){
			numeroTotalPaginas = numeroTotalRegistros / numeroRegistrosPorPagina;
		}
		else{
			numeroTotalPaginas = (numeroTotalRegistros / numeroRegistrosPorPagina) + 1;
		}
		return numeroTotalPaginas;
	}

}
