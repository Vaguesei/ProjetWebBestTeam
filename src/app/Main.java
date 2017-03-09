package app;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		//main method to launch everything
		
		//ici, le DSL devra remplacer "Paris", "Rennes" et "naissances" 
		//par ce que l'utilisateur aura écrit en utilisantnotre langage
		Data d = new Data(new Ville("Paris"), new Ville("Rennes"), new Theme("naissances"));
		
		d.getData();
		
		//choix par l'utilisateur des datasets pour chaque ville
		d.v1.chooseDatasets();
		d.v2.chooseDatasets();
		
		//choix par l'utilisateur des colonnes pour chaque dataset
		d.v1.chooseColumn();
		d.v2.chooseColumn();
		
		System.out.println("on va bosser avec la colonne "+d.v1.choosenColumn+"du dataset"+d.v1.choosenDataset);
		System.out.println("on va bosser avec la colonne "+d.v2.choosenColumn+"du dataset"+d.v2.choosenDataset);

		/*
		 * TODO
		 * 
		 * calculer la correlation / tracer le graphique (utilisation de Renjin ou JSAT ?) sur les objets
		 * d.v1.getDataset("nom du dataset choisi dans la ville 1").getColumn("nom de la 1e colonne choisi")
		 * d.v1.getDataset("nom du dataset choisi dans la ville 1").getColumn("nom de la 2e colonne choisi")
		 * d.v2.getDataset("nom du dataset choisi dans la ville 1").getColumn("nom de la 3e colonne choisi")
		 * d.v2.getDataset("nom du dataset choisi dans la ville 1").getColumn("nom de la 4e colonne choisi")
		 */
	}

}
