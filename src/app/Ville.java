package app;

public class Ville {
	public String name ;
	public String adress ;

	public Ville(String name){
		this.name = name ;

		switch (name.toLowerCase()) {
		case "paris":
			adress = "https://opendata.paris.fr/";
			break;
		case "rennes":
			adress = "https://data.rennesmetropole.fr/";
			break;
		case "toulouse":
			adress = "https://data.toulouse-metropole.fr/";
			break;
		case "lille":
			adress = "https://opendata.lillemetropole.fr/";
			break;
		default: 
			adress = "";
			break;
		}
	}

}
