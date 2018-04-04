package json;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.stream.JsonGenerator;

public class CreatePersonWithGenerator {

	public static void main(String[] args) {

		JsonGenerator gen = Json.createGenerator(System.out);
		
		gen.writeStartObject();
		gen.write("name", "Srikanth");
		gen.write("occupation", "Director");
		gen.write("company", "Srikanth Technologies");
		gen.writeEnd();
		gen.close();

	}

}
