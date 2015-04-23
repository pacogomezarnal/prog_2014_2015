import java.io.InputStream;
import java.net.URL;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;


public class ApiJSON {

	public static void main(String[] args) {
		try{
			URL url = new URL("http://agendavirtual.ddns.net/api/web.php");
			InputStream is =url.openStream();
			JsonReader rdr = Json.createReader(is);
			JsonObject obj = rdr.readObject();
			System.out.println(obj.getString("parametro1"));
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
