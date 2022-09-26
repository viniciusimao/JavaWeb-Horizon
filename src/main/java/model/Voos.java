package model;

public class Voos {
	private int idVoo;
	private String localVoos;
	
	
	public int getIdVoo() {
		return idVoo;
	}
	public void setIdVoo(int idVoo) {
		this.idVoo = idVoo;
	}
	public String getLocalVoos() {
		return localVoos;
	}
	public void setLocalVoos(String localVoos) {
		this.localVoos = localVoos;
	}
	@Override
	public String toString() {
		return "Voos [idVoo=" + idVoo + ", localVoos=" + localVoos + "]";
	}
	
	
}
