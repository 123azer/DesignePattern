public class File extends Origine {
	
	public File(String nom) {
		super();
		this.setNom(nom);
		this.setType(TypeComposante.fichier);
		this.composants=null;
	}
	
    
	@Override
	public void Contenu() {
		System.out.println("ouvrir le fichier");
		
	}

}
