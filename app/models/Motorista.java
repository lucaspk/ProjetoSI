package models;
import java.util.*;
import com.avaje.ebean.Model;
import javax.persistence.*;

public class Motorista extends Usuario{
	
	private int num_vagas;
	private List<Carona> caronas;
	private List<String> rota;

	public Motorista(String nome, String matricula, String telefone, String bairro, String email, String rua,
			String senha, int numero_vagas) {
		super(nome, matricula, telefone, bairro, email, rua, senha);
		
		this.num_vagas = numero_vagas;
		this.caronas = new ArrayList<Carona>();
		
	}

	public List<String> getRota() {
		return rota;
	}
	
	public void setRota(List<String> rota) {
		this.rota = rota;
	}

	public int getNum_vagas() {
		return num_vagas;
	}

	public List<Carona> getCaronas() {
		return caronas;
	}

	public void setCaronas(List<Carona> caronas) {
		this.caronas = caronas;
	}


	@Override
	public void setHorarios(List<Horario> horario){
		super.setHorarios(horario);
		instanciaCaronas();
	}
	
	private void instanciaCaronas (){
		// para cada horario, cria uma carona vazia para esse motorista
		for (Horario horario : getHorarios()) {
			Carona carona = new Carona (horario, this);
			caronas.add(carona);
		}
	}
	
	@Override
	public String toString() {
		return "Nome do motorista: " + getNome() + "\n" +
				"Numero do telefone: " + getTelefone();
	}
	
	
	
	
	

}
