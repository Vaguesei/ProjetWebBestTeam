package app;

public class Ville {
	public String name ;
	public String adress ;

	public Ville(String name){
		this.name = name ;

		switch (name.toLowerCase()) {
		case "paris":
			adress = "https://opendata.paris.fr/explore/?sort=modified";
			break;
		case "rennes":
			adress = "https://data.rennesmetropole.fr/explore/?sort=modified";
			break;
		case "toulouse":
			adress = "https://data.toulouse-metropole.fr/explore/?sort=modified";
			break;
		case "lille":
			adress = "https://opendata.lillemetropole.fr/explore/?sort=modified";
			break;
		default: 
			adress = "";
			break;
		}
	}

}
