package app;

public class Main {

	public static void main(String[] args) {
		//main method to launch everything
		
		//ici, le DSL devra remplacer "Paris", "Rennes" et "naissances" 
		//par ce que l'utilisateur aura écrit en utilisantnotre langage
		Data d = new Data(new Ville("Paris"), new Ville("Rennes"), new Theme("naissances"));
		
		d.getData(); //faudra reflechir a la facon de stocker ces datasets
		//peut-etre un attribut List<datasets> dans la classe ville ?
		
		/*
		 * TODO
		 * 
		 * afficher a l'utilisateur les datasets qu'on a pour chaque ville dans le theme qu'il a choisi
		 * genre afficher d.v1.getDatasetsNames() et d.v2.getDatasetsNames()
		 * 
		 * lui demander quel dataset il veut utiliser pour chaque ville
		 * 
		 * afficher les colonnes de chaque dataset
		 * genre d.v1.getDataset("nom du dataset choisi dans la ville 1").getColumnNames
		 * et d.v2.getDataset("nom du dataset choisi dans la ville 2").getColumnNames
		 * 
		 * faire choisir a l utilisateur 2 colonnes dans chacun des 2 datasets
		 * 
		 * calculer la correlation / tracer le graphique (utilisation de Renjin ou JSAT ?) sur les objets
		 * d.v1.getDataset("nom du dataset choisi dans la ville 1").getColumn("nom de la 1e colonne choisi")
		 * d.v1.getDataset("nom du dataset choisi dans la ville 1").getColumn("nom de la 2e colonne choisi")
		 * d.v2.getDataset("nom du dataset choisi dans la ville 1").getColumn("nom de la 3e colonne choisi")
		 * d.v2.getDataset("nom du dataset choisi dans la ville 1").getColumn("nom de la 4e colonne choisi")
		 */
		
		
		//tests ici qui seront enleves :
		System.out.println(d.v1.name + " : " + d.v1.adress);
		System.out.println(d.v2.name + " : " + d.v2.adress);
		System.out.println("Theme choisi : " + d.theme.name);
	}

}
