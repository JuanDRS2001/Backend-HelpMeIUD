package co.edu.iudigital.app.dto;

import lombok.Builder;
import lombok.Data;

@Data //Getteres & Setteres
@Builder //construcción de objetos
public class DelitoDto {
	private Long id;
	private String nombre;
	private String descripcion;
}
