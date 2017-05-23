package entidades;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Table(name="enderecos")
public class Endereco {
	
	@Id
	private String cep;
	private String logradouro;
	@ManyToOne
	@JoinColumn(name="id_tipolog")
	private TipoLog tipoLog;
	@ManyToOne
	@JoinColumn(name="id_bairro")
	private Bairro bairro;
	
	
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public TipoLog getTipoLog() {
		return tipoLog;
	}
	public void setTipoLog(TipoLog tipoLog) {
		this.tipoLog = tipoLog;
	}
	public Bairro getBairro() {
		return bairro;
	}
	public void setBairro(Bairro bairro) {
		this.bairro = bairro;
	}
	

}
