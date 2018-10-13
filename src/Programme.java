
public class Programme {

	public static void main(String[] args) {
		
		Repertoire repertoire=new Repertoire("racine");
		Repertoire repertoire1=new Repertoire("badr");
		Repertoire repertoire2=new Repertoire("admin");
		Repertoire repertoire3=new Repertoire("system");
		
		File file1=new File("image.jpg"); file1.setSize(1);
		File file2=new File("image2.jpg");file2.setSize(2);
		File file3=new File("video.jpg");file3.setSize(2);
		
		repertoire.Ajouter(repertoire1);
		repertoire.Ajouter(repertoire2);
		repertoire.Ajouter(repertoire3);
		repertoire1.Ajouter(file1);
		repertoire2.Ajouter(file2);
		repertoire3.Ajouter(file3);
		repertoire.Chercher("video.jpg");
		repertoire.Chercher("image2.jpg");
		repertoire.Chercher("image.jpg");
		System.out.println("-----------------------------------------\n");
		repertoire2.Ajouter(file3);
		repertoire3.Ajouter(file2);
		
		
		repertoire.Chercher("video.jpg");
		repertoire.Chercher("image2.jpg");
		repertoire.Chercher("image.jpg");
		System.out.println(repertoire.getSize()+"\n");
		System.out.println(repertoire2.getSize()+"\n");
		System.out.println(repertoire3.getSize()+"\n");

	}

}
