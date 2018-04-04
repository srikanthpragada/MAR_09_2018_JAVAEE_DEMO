package json;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;

public class CreatePersonObject {

	public static void main(String[] args) {

		JsonObjectBuilder builder = Json.createObjectBuilder();
		builder.add("name", "Srikanth");
		builder.add("occupation", "Director");
		builder.add("company", "Srikanth Technologies");

		JsonObject person = builder.build();
		System.out.println(person);

	}

}
