package org.icabanas.jee.api.integracion.dao;

import java.util.List;

/**
 * Interface que representa una paginador de registros.
 * 
 * <br/><br/>
 * <b>Responsabilidad</b> :  
 * <br/>
 * <br/>
 * <ul>
 * <li></li> 
 * </ul>
 *
 * @author f009994r
 *
 * @param <T>
 * 		Tipo de datos del paginador.
 */
public interface IPaginador<T> {

	/**
	 * @return
	 * 		La p�gina actual.
	 */
	int getPagina();

	/**
	 * @return
	 * 		Tama�o de p�gina.
	 */
	int getNumeroRegistrosPorPagina();

	/**
	 * @return
	 * 		N�mero total de p�ginas.
	 */
	int getNumeroTotalPaginas();

	/**
	 * @return
	 * 		N�mero total de registros.
	 */
	int getNumeroTotalRegistros();

	/**
	 * @return
	 * 		Los registros de la p�gina actual.
	 */
	List<T> getDatos();

	/**
	 * @param datos
	 * 		Los registros de la p�gina actual.
	 */
	void setDatos(List<T> datos);

	/**
	 * Devuelve el �ndice del primer registro de la p�gina actual.
	 * 
	 * @return
	 */
	int getPrimerRegistro();

	/**
	 * Establece el n�mero total de registros.
	 * 
	 * @param numeroTotalRegistros
	 */
	void setNumeroTotalRegistros(int numeroTotalRegistros);

	/**
	 * Establece el filtro de b�squeda de la consulta.
	 * 
	 * @param filtro
	 */
	void setFiltro(IFiltro filtro);

	/**
	 * Establece la p�gina actual.
	 * 
	 * @param pagina
	 */
	void setPagina(int pagina);

	/**
	 * Establece el n�mero total de registros por p�gina.
	 * 
	 * @param numeroRegistrosPorPagina
	 */
	void setNumeroTotalRegistrosPorPagina(int numeroRegistrosPorPagina);

	/**
	 * Obtiene el filtro de la b�squeda paginada.
	 * 
	 * @return
	 */
	IFiltro getFiltro();
}
