package viaggi;

public class Pacchetto {
	
	private String ID;
	private String descrizione;
	private int postiTotali;
	
	public Pacchetto(String ID, String descrizione, int postiTotali){
		if(ID.length() != 0){
			this.ID = ID;
		}else{
			throw new IllegalArgumentException("L'ID deve essere maggiore di 0");
		}
		
		if(descrizione.length() != 0){
			this.descrizione = descrizione;
		}else{
			throw new IllegalArgumentException("La descrizione deve essere maggiore di 0");
		}
		
		if(postiTotali > 0){
			this.postiTotali = postiTotali;
		}else{
			throw new IllegalArgumentException("I posti totali devono essere positivi");
		}
		
	}
	
	public String getID(){
		return ID;
	}
	public String getDescrizione(){
		return descrizione;
	}
	public int postiTotali(){
		return postiTotali;
	}
	public String getPostiDisponibili(){
		
	}
	
}
