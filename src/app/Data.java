package app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map.Entry;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class Data {
	public Ville v1;
	public Ville v2;
	public Theme theme;

	public Data(Ville ville1, Ville ville2, Theme t){
		v1=ville1;
		v2=ville2;
		theme=t;
	}

	public void getData() throws IOException {
		HashMap<String, String> datasetsV1 = rechercherDatasets(v1);
		HashMap<String, String> datasetsV2 = rechercherDatasets(v2);
		
		System.out.println(v1.name);
		for (Entry<String, String> dataset : datasetsV1.entrySet()) {
			System.out.println(dataset.getKey() +" : "+ dataset.getValue());
		}
		
		System.out.println(v2.name);
		for (Entry<String, String> dataset : datasetsV2.entrySet()) {
			System.out.println(dataset.getKey() +" : "+ dataset.getValue());
		}
	}

	public HashMap<String, String> rechercherDatasets(Ville ville) throws IOException {
		String url = ville.adress + "api/datasets/1.0/search/?q=" + theme.name;
		String content = getText(url);
		
		JsonObject json = new JsonParser().parse(content).getAsJsonObject();
		JsonArray datasets = json.get("datasets").getAsJsonArray();
		
		HashMap<String, String> hashmap = new HashMap<String, String>();
		for (JsonElement e : datasets) {
			JsonObject obj1 = e.getAsJsonObject();
			JsonObject obj2 = obj1.get("metas").getAsJsonObject();
			hashmap.put(obj1.get("datasetid").getAsString(), obj2.get("title").getAsString());
		}
		
		return hashmap;
	}
	
	public static String getText(String url) throws IOException {
        URL website = new URL(url);
        URLConnection connection = website.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));

        StringBuilder response = new StringBuilder();
        String inputLine;

        while ((inputLine = in.readLine()) != null) 
            response.append(inputLine);

        in.close();

        return response.toString();
    }

    public static void main(String[] args) throws IOException {
    	Data d = new Data(new Ville("Paris"), new Ville("Rennes"), new Theme("naissances"));
    	d.getData();
    }
}
