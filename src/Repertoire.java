import java.util.ArrayList;

public class Repertoire extends Origine implements observateurSup {
	
	
	public Repertoire(String nom)
	{
		super();
		this.setNom(nom);
	    this.Type=TypeComposante.Repertoire;
	    this.setChemin(nom);
	    this.setSize(0);
	    composants=new ArrayList<Origine>();
	}
	
	


	public void Ajouter(Origine composant)
	{   boolean NoDouble=true;
		for(Origine element : composants){
			if (element.getNom().contains(composant.getNom()))
			{
				   NoDouble=false;
			       break;
			}
		} 
		if(NoDouble)
			
		{   
			composants.add(composant);
			composant.setChemin(this.getChemin()+"/"+composant.getNom());
			this.notifierObservateurInf();
			this.setSize(this.getSize()+composant.getSize());
			composant.ajouterObservateurSup(this);
		}
	

	}
	
	public void Supprimer(Origine composant)
	
	{
		composants.remove(composant);
		composant.setChemin("");
		this.setSize(this.getSize()-composant.getSize());
		composant.supprimerObservateurSup();
	}
	
	public void Contenu()
	{
		 if(composants.isEmpty())
		    	System.out.println("repertoire vide \n");
		 else
		 { System.out.println( "le repertoire "+ this.getNom() +" est composé des elements suivants:");
			      for(Origine element : composants){
			        System.out.print("\t");
			        System.out.println("le "
			        + element.getType()
			        +"// Nom:"+element.getNom()
			        +"// Taille :"+element.getSize()
			        +"// Son chemin: "+element.getChemin()); 
			       }
		 }
	}
	
	public void Chercher(String composant)
	{
		if(!composants.isEmpty())
		{ 
		    for(Origine element : composants)
		    {
		      if(element.getNom().contains(composant))
				System.out.println("Nom: "+element.getNom()+" son chemin: "+element.getChemin()+"\n");
		      if(element.getType()==TypeComposante.Repertoire)
		         element.Chercher(composant);
		    }
		}
	}

	@Override
	public void actualiserSup() {
		Size=0;
		for(Origine element:composants)
		 {
			Size=Size+element.getSize();
		 }
		if(observateurSup!=null)
			notifierObservateurSup();
	}
	
}
