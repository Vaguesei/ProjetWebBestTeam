package app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

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
		String urlV1 = v1.adress + "api/datasets/1.0/search/?q=" + theme.name;
		String urlV2 = v1.adress + "api/datasets/1.0/search/?q=" + theme.name;
		
		String contentV1 = getText(urlV1);
		String contentV2 = getText(urlV2);
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
        String content = Data.getText("https://data.rennesmetropole.fr/api/datasets/1.0/search/?q=annuel");
        System.out.println(content);
    }
}
