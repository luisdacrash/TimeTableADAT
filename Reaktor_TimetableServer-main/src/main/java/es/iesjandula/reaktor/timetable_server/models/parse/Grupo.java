package es.iesjandula.reaktor.timetable_server.models.parse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author David Martinez
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Grupo implements Comparable<Grupo>
{
	/** Attribute numIntGr*/
	private String numIntGr;
	
	/** Attribute abreviatura*/
	private String abreviatura;
	
	/** Attribute nombre*/
	private String nombre;

	@Override
	public int compareTo(Grupo other) {

		return this.nombre.compareTo(other.nombre);
	}
	
	
}