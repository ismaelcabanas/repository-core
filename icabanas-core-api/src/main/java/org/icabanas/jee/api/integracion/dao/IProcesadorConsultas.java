package org.icabanas.jee.api.integracion.dao;

import java.util.List;


/**
 * Procesador de operaciones de consulta de entidades contra un repositorio de datos.
 * 
 * <br/><br/>
 * <b>Responsabilidad</b>:   
 * <br/>
 * <br/>
 * <ul>
 * <li>Realizar operaciones de consulta de una entidad contra un repositorio de datos (consultas paginadas, sin paginar, que devuelven un �nico registro).</li> 
 * </ul>
 *
 * @author f009994r
 *
 * @param <Entidad>
 */
public interface IProcesadorConsultas<Entidad> {
	
	/**
	 * Prepara al procesador de consultas para realizar una nueva consulta.
	 *  
	 * Este m�todo se debe ejecutar despu�s de cada consulta para poder realizar una nueva.
	 *  
	 */
	void nuevaConsulta();	

	/**
	 * M�todo que ejecuta una consulta.
	 * 
	 * El procesador de consultas queda preparado para la siguiente consulta.
	 * 
	 * @return
	 * 		Lista de entidades
	 */
	List<Entidad> ejecutarConsultaListado();
	
	/**
	 * M�todo que ejecuta una consulta paginada.
	 * 
	 * El procesador de consultas queda preparado para la siguiente consulta.
	 * 
	 * @param paginaActual
	 * @param numeroRegistrosPorPagina
	 * @return
	 * 		Lista de entidades
	 */
	List<Entidad> ejecutarConsultaListado(int paginaActual,
			int numeroRegistrosPorPagina);

	/**
	 * M�todo que ejecuta una consulta que devuelve un �nico registro.
	 * 
	 * El procesador de consultas queda preparado para la siguiente consulta.
	 * 
	 * @return
	 * 		La entidad devuelta por la consulta
	 */
	Entidad ejecutarConsultaUnicoRegistro();
	
	/**
	 * M�todo que cuenta los registros de una consulta.
	 * 
	 * El procesador de consultas queda preparado para la siguiente consulta.
	 * 
	 * @return
	 */
	int contarRegistros();
	
//	/**
//	 * M�todo que cuenta los registros de una consulta.
//	 * 
//	 * El m�todo se debe utilizar para contar el n�mero de registros en una consulta paginada, 
//	 * ya que el procesador de consultas no se inicializar�.
//	 * 
//	 * @return
//	 */
//	int contarRegistrosPaginacion();

	/**
	 * M�todo que establece la clase de persistencia.
	 * 
	 * @param persistentClass
	 */
	void setPersistentClass(Class<Entidad> persistentClass);
	
	/**
	 * M�todo que aplica a la consulta la ordenaci�n ascendente sobre un campo.
	 * 
	 * @param campo
	 * 		Campo de ordenaci�n.
	 */
	void ordenarPorAsc(String campo);
	
	/**
	 * M�todo que aplica a la consulta la ordenaci�n descendente sobre un campo.
	 * 
	 * @param campo
	 * 		Campo de ordenaci�n.
	 */
	void ordenarPorDesc(String campo);
	
	/**
	 * M�todo que aplica a la consulta la condici�n igual que.
	 * 
	 * @param campo
	 * 		El campo de la entidad sobre la que aplica la condici�n.
	 * @param valor
	 * 		Valor de comparaci�n
	 */
	void andIgualQue(String campo, Object valor);

	/**
	 * M�todo que aplica a la consulta la condici�n like
	 * 
	 * @param campo
	 * 		El campo de la entidad sobre la que aplica la condici�n.
	 * @param valor
	 * 		Valor de comparaci�n
	 */
	void andLike(String campo, Object valor);
			

}
