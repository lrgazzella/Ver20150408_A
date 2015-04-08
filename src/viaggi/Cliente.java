package viaggi;

public class Cliente {
	private String nome;
	private String cognome;
	private String email;
	
	public Cliente(String nome, String cognome, String email){
		if( nome.length() > 0 ){
			this.nome = nome;
		}else{
			throw new IllegalArgumentException("Il nome deve essere più lungo di 0 cifre");
		}
		
		if( cognome.length() > 0 ){
			this.cognome = cognome;
		}else{
			throw new IllegalArgumentException("Il cognome deve essere più lungo di 0 cifre");
		}
		if( email.length() > 0 ){
			this.email = email;
		}else{
			throw new IllegalArgumentException("L'email deve essere più lunga di 0 cifre");
		}
		
	}
	
	public String getNome(){
		return nome;
	}
	public String getCognome(){
		return cognome;
	}
	public String getEmail(){
		return email;
	}
	
	
	@Override
    public String toString() {
        String risultato;
        risultato = "(Nome:" + this.nome + ", Cognome:" + this.cognome + ", Email: " + this.email + ")";
        return risultato;
    }
}
