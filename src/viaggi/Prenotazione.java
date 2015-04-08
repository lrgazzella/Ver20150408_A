package viaggi;

public class Prenotazione{
	
	private String ID;
	private int posti;
	
	public Prenotazione(String ID, int posti, Cliente c){
		if( ID.length() != 0){
			this.ID = ID;
		}else{
			throw new IllegalArgumentException("L'ID deve essere diverso da 0");
		}
		
		if( posti > 0 ){
			this.posti = posti;
		}else{
			throw new IllegalArgumentException("I posti devono essere maggiori di 0");
		}
		Cliente a = new Cliente(c.getNome(), c.getCognome(), c.getEmail());		
	}
	
	public String getID(){
		return ID;
	}
	public int getPosti(){
		return posti;
	}
	public Cliente getCliente(){
		 
	}
	
	@Override
    public String toString() {
        String risultato;
        risultato = "(ID:" + this.ID + ", Posti:" + this.posti + ")";
        return risultato;
    }
	
	
}
