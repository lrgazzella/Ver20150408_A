package viaggi;

public class ViaggioDiNozze extends Pacchetto{
	
	private int divorzi;
	
	public ViaggioDiNozze(String ID, String descrizione, int postiTotali, int divorzi){
		super(ID, descrizione, postiTotali);
		if(divorzi > 0){
			this.divorzi = divorzi;
		}else{
			throw new IllegalArgumentException("Divorsi maggiore di 0");
		}
		
	}
	
	public int getDivorzi(){
		return divorzi;
	}
	
}
