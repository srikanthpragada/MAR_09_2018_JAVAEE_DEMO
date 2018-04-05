package json;

import java.net.URL;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;

public class ReadGithubUserInfo {

	public static void main(String[] args) {
		try {
			URL url = new URL("https://api.github.com/users/srikanthpragada");
			JsonReader reader = Json.createReader(url.openStream());
			JsonObject user = reader.readObject();

			System.out.println(user.getString("name"));
			System.out.println(user.getString("company"));
		} catch (Exception ex) {
			System.out.println("Error : " + ex.getMessage());
		}

	}

}
