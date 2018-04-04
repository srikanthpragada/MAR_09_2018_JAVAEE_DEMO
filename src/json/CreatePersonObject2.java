package json;

import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;

public class CreatePersonObject2 {

	public static void main(String[] args) {

		JsonObjectBuilder builder = Json.createObjectBuilder();
		builder.add("name", "Srikanth");
		builder.add("occupation", "Director");
		builder.add("company", "Srikanth Technologies");
		
		JsonArrayBuilder phones = Json.createArrayBuilder();
		phones.add("9059057000");
		phones.add("0891-2541948");
		
		builder.add("phones",phones);
		

		JsonObject person = builder.build();
		System.out.println(person);

	}

}
