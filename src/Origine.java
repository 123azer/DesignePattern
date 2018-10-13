import java.util.List;

public class Origine implements observableInf{
	protected String Nom;
	protected int Size;
	protected TypeComposante Type;
	protected String Chemin;
	protected List<Origine> composants;
	protected observateurSup observateurSup;
	
	
	public Origine() {
		Chemin=new String();
	}
	
	public Origine(Origine o) {
		this.Nom=o.getNom();
	    this.Type=o.getType();
	    this.Chemin=o.getChemin();
	    this.setSize(o.getSize());
	}
	
	public TypeComposante getType() {
		return Type;
	}
	public void setType(TypeComposante type) {
		Type = type;
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public int getSize() {
		return Size;
	}
	public void setSize(int size) {
		Size = size;
		if(observateurSup!=null)
		   notifierObservateurSup();
	}
	public String getChemin() {
		return Chemin;
	}
	public void setChemin(String chemin) {
		this.Chemin = chemin;
	}
	public void Contenu() {}
	public void Chercher(String composant) {}
	
	@Override
	public void ajouterObservateurSup(observateurSup obj) {
		observateurSup=obj;
	}

	@Override
	public void supprimerObservateurSup() {
		observateurSup=null;
	}

	@Override
	public void notifierObservateurSup() {
		observateurSup.actualiserSup();
	}

	public observateurSup getObservateurSup() {
		return observateurSup;
	}

    public void notifierObservateurInf() {
      if(this.composants!=null)
      for (Origine origine : composants) {
		 origine.setChemin(this.getChemin()+"/"+origine.getNom());
		if(origine.composants!=null)
	     origine.notifierObservateurInf();
	   }	
	}
	
	
}
