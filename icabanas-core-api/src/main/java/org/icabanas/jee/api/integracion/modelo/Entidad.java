package org.icabanas.jee.api.integracion.modelo;

import java.io.Serializable;

import org.icabanas.jee.api.integracion.manager.exceptions.ValidacionException;

public interface Entidad<ID extends Serializable> {

	/**
	 * M�todo que devuelve el identificador de la entidad.
	 * 
	 * @return
	 */
	public ID getId();
	
	/**
	 * M�todo que establece el identificador de la entidad.
	 * 
	 * @param id
	 */
	public void setId(ID id);
	
	/**
	 * M�todo que comprueba si la entidad es vac�a, es decir, que el valor de todos sus campos son nulos o 
	 * vac�os.
	 * 
	 * @return
	 */
	public boolean esVacia();
	
	/**
	 * Valida una entidad.
	 * 
	 * @return
	 * 		True si la entidad es v�lida.
	 * 
	 * @throws ValidacionException
	 * 		En el caso que la entidad no sea v�lida, indicando los campos err�neos.
	 */
	public boolean valida() throws ValidacionException;
}
