package tecPlane;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

public class SMS {

	public static void main(String[] args) throws Exception{
		
		String message = "";		
		String phone = "+50670650043";
		String username = "abcd";
		String password = "1234";
		String address = "http://172.18.249.126";
		String port = "8090";
		
		URL url = new URL(
				address+":"+port+"/SendSMS?username="+username+"&password="+password+
				"&phone="+phone+"&message="+URLEncoder.encode(message,"UTF-8"));
		
		URLConnection connection = url.openConnection();
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
		String inputLine;
		while((inputLine = bufferedReader.readLine()) !=null){
			System.out.println(inputLine);
		}
		bufferedReader.close();
		

	}

	
}
		
	

