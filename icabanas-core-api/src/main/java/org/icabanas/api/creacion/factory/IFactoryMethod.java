package org.icabanas.api.creacion.factory;

/**
 * <b>Patr�n de dise�o Factory Method</b>: Define una interfaz para crear 
 * un objeto, permitiendo a las subclases decidir qu� clase instanciar.
 * <br/><br/>
 * 
 * <b>Responsabilidad</b> Definici�n abstracta del "Creador": <br/>
 * <br/>
 * <ul>
 * <li>Declara el m�todo de la factor�a de objetos, el cual devuelve un 
 * objeto del tipo definido en el par�metro.
 * </li> 
 * </ul>
 * 
 * @author f009994r
 *
 * @param <T>
 * 		Tipo del objeto a crear.
 */
public interface IFactoryMethod<T> {

	public T crear();
}
