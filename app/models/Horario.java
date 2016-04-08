package models;

import com.avaje.ebean.Model;
import javax.persistence.Entity;
import javax.persistence.Id;

public class Horario extends Model{
	
	private String dia;
	private String tipo;
	private String hora;

	public Horario(String tipo, String dia, String hora) {
		this.dia = dia;
		this.tipo = tipo;
		this.hora = hora;
		
	}
	
	public String getHora() {
		return hora;
	}

	public String getDia() {
		return dia;
	}

	public String getTipo() {
		return tipo;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Horario){
			Horario other = (Horario) obj;
			return dia == other.getDia() && tipo == other.getTipo();
		}
		
		return false;
	}
}
