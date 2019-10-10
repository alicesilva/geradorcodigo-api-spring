package modelconta;
import javax.persistence.*;

@Entity
public class Conta {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private Integer numero;
	
	private String tipoConta;
	
	public Integer getNumero(){
		return numero;
	}
	
	public void setNumero(Integer numero){
		this.numero = numero;
	}

	public String getTipoConta(){
		return tipoConta;
	}
	
	public void setTipoConta(String tipoConta){
		this.tipoConta = tipoConta;
	}
}
