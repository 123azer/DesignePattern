
public class Programme {

	public static void main(String[] args) {
		// creation des repertoires
		Repertoire repertoire=new Repertoire("racine");
		Repertoire repertoire1=new Repertoire("123azer");
		Repertoire repertoire2=new Repertoire("admin");
		Repertoire repertoire3=new Repertoire("system");
		// creation des fichiers
		File file1=new File("image.jpg"); file1.setSize(1);
		File file2=new File("Audio.mp3");file2.setSize(2);
		File file3=new File("video.mp4");file3.setSize(5);
		File file4=new File("photo.jpg");file3.setSize(2);
		
		repertoire.Ajouter(repertoire1); // racine/123azer
		repertoire.Ajouter(repertoire2);// racine/admin
		repertoire.Ajouter(repertoire3);// racine/system
		repertoire1.Ajouter(file1); // racine/123azer/image.jpg
		repertoire1.Ajouter(file2);// racine/123azer/Audio.mp3
		repertoire1.Ajouter(file3);// racine/123azer/video.mp4
		repertoire.Chercher("image.jpg");
		repertoire.Chercher("Audio.mp3");
		repertoire.Chercher("video.mp4");
		System.out.println("-----------------------------------------\n");
		System.out.println(repertoire.getSize()+"\n");// 8
		System.out.println(repertoire1.getSize()+"\n");// 8
		System.out.println(repertoire2.getSize()+"\n");// 0
		repertoire2.Ajouter(repertoire1); // racine/admin/123azer
		repertoire.Chercher("image.jpg");// racine/admin/123azer/image.jpg
		repertoire2.Ajouter(file4);// racine/admin/photo.jpg
		
		System.out.println(repertoire.getSize()+"\n");// 10
		System.out.println(repertoire1.getSize()+"\n");// 8
		System.out.println(repertoire2.getSize()+"\n");// 10

	}

}
