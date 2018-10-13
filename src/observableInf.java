
public interface observableInf {
	
	   //methods to register and unregister observers
		public void ajouterObservateurSup(observateurSup obj);
		public void supprimerObservateurSup();
		
		//method to notify observers of change
		public void notifierObservateurSup();
}
