package json;

import javax.json.Json;
import javax.json.stream.JsonGenerator;

import oracle.jdbc.rowset.OracleCachedRowSet;

public class WriteJobsToJson {
	public static void main(String[] args) throws Exception {
		OracleCachedRowSet rs = new OracleCachedRowSet();
		rs.setUrl("jdbc:oracle:thin:@localhost:1521:XE");
		rs.setUsername("hr");
		rs.setPassword("hr");
		rs.setCommand("select * from jobs");
		rs.execute();

		JsonGenerator gen = Json.createGenerator(System.out);
		gen.writeStartArray();

		while (rs.next()) {
			gen.writeStartObject();
			gen.write("id", rs.getString("job_id"));
			gen.write("title", rs.getString("job_title"));
			gen.writeEnd();
		}

		gen.writeEnd();
		gen.close();
	}

}
