package es.iesjandula.reaktor.timetable_server.models.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author David Jason
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ProfesorEntity 
{
	
	@Id
	private String numIntPR;
	
	private String abreviatura;
	
	private String nombre;
	
	private String primerApellido;
	
	private String segundoApellido;

}