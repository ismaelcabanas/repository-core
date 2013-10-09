package org.icabanas.jee.api.integracion.dao;

import java.util.List;

/**
 * Clase que almacena los objetos de una consulta realizada contra un sistema de persistencia. 
 * 
 * <br/><br/>
 * <b>Responsabilidad</b> :  Almacena un listado de objetos que provienen de una consulta paginada o no.
 * Si la consulta es paginada, proporciona la siguiente informaci�n:
 * <ul>
 * <li>N�mero total de p�ginas de la consulta.</li>
 * <li>P�gina actual.</li>
 *  
 * 
 * @author f009994r
 *
 * @param <T> Tipo de objeto que maneja la clase.
 */
public class ResultadoPaginado<T> {

	/**
	 * Lista de elementos de tipo <T>. 
	 */
	private List<T> elementos;
	
	/**
	 * N�mero total de p�ginas.
	 */
	private int numeroTotalPaginas = -1;

	/**
	 * P�gina actual.
	 */
	private int paginaActual = -1;

	/**
	 * N�mero total de registros.
	 */
	private int numeroTotalRegistros = -1;

	public ResultadoPaginado(List<T> elementos) {		
		this.elementos = elementos;
		this.numeroTotalPaginas = -1;
		this.paginaActual = -1;
	}

	public ResultadoPaginado(List<T> elementos, int paginaActual,
			int numeroTotalPaginas, int numeroTotalRegistros) {
		this.elementos = elementos;
		this.paginaActual = paginaActual;
		this.numeroTotalPaginas = numeroTotalPaginas;
		this.numeroTotalRegistros = numeroTotalRegistros;
	}

	public List<T> getElementos() {
		return elementos;
	}

	public int getNumeroTotalPaginas() {
		return numeroTotalPaginas;
	}

	public int getPaginaActual() {
		return paginaActual;
	}

	/**
	 * 
	 * @return
	 * 		true si el resultado de la b�squeda es vac�o, false en caso contrario.
	 */
	public boolean esVacio() {
		return (this.elementos == null || this.elementos.size() == 0);
	}

	public int getNumeroTotalRegistros() {
		return numeroTotalRegistros;
	}

}
