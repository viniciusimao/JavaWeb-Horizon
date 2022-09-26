package model;

public class Cliente {
	private int idCli;
	private String nomeCli;
	private String emailCli;
	private String telCli;
	private String senhaCli;
	
	
	public int getIdCli() {
		return idCli;
	}
	public void setIdCli(int idCli) {
		this.idCli = idCli;
	}
	public String getNomeCli() {
		return nomeCli;
	}
	public void setNomeCli(String nomeCli) {
		this.nomeCli = nomeCli;
	}
	public String getEmailCli() {
		return emailCli;
	}
	public void setEmailCli(String emailCli) {
		this.emailCli = emailCli;
	}
	public String getTelCli() {
		return telCli;
	}
	public void setTelCli(String telCli) {
		this.telCli = telCli;
	}
	public String getSenhaCli() {
		return senhaCli;
	}
	public void setSenhaCli(String senhaCli) {
		this.senhaCli = senhaCli;
	}
	@Override
	public String toString() {
		return "Cliente [idCli=" + idCli + ", nomeCli=" + nomeCli + ", emailCli=" + emailCli + ", telCli=" + telCli
				+ ", senhaCli=" + senhaCli + "]";
	}
	
	
	
}
