package json;

import com.google.gson.Gson;

public class PersonToJson {

	public static void main(String[] args) {
		 Person p = new Person();
		 p.setName("Abc");
		 p.setEmail("abc@gmail.com");
		 p.setMobile("93939323232");
		 
		 Gson gson = new Gson();
		 System.out.println(gson.toJson(p));

	}

}
