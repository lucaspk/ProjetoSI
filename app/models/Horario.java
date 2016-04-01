package models;

import com.avaje.ebean.Model;
import javax.persistence.Entity;
import javax.persistence.Id;

public class Horario extends Model{
	
	private DiaDaSemana dia;
	private TipoDaCarona tipo;
	private Hora hora;

	public Horario(TipoDaCarona tipo, DiaDaSemana dia, Hora hora) {
		this.dia = dia;
		this.tipo = tipo;
		this.hora = hora;
		
	}
	
	public Hora getHora() {
		return hora;
	}

	public DiaDaSemana getDia() {
		return dia;
	}

	public TipoDaCarona getTipo() {
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
	
	
	@Override
	public String toString() {
		return "Dia da semana: " + getDia() + "\n" + "Hora: " + hora.getHora() + "h" + "\n" + "Tipo: " + getTipo();
	}
}
