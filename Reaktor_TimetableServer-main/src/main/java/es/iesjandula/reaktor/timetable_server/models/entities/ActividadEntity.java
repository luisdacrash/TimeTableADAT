package es.iesjandula.reaktor.timetable_server.models.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
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
@Entity
public class ActividadEntity 
{

	@Id
	@ManyToOne
	private TimeSlotEntity tramo;

	@Id
	@ManyToOne
	private AulaEntity aula;

	@Id
	@ManyToOne
	private ProfesorEntity profesor;

	private String numAct;

	private String numUn;
	
	@ManyToOne
	private AsignaturaEntity asignatura;
	
	@ManyToOne
	private GrupoEntity grupo;
		
}