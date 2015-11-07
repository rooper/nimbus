package nimbus;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

public class Messaging {
	
	
	public String createMessage() {
		return "";
	}
	
	public void post(String message) throws MalformedURLException, IOException {
		String url = AccessConstants.TWILIO_URL;
		String charset = java.nio.charset.StandardCharsets.UTF_8.name();
		String toParam = AccessConstants.TWILIO_NUMBER;
		String fromParam = AccessConstants.TWILIO_FROM_NUMBER;
		String query = String.format("to=%s&from=%s", 
		     URLEncoder.encode(toParam, charset), 
		     URLEncoder.encode(fromParam, charset));
		URLConnection connection = new URL(url).openConnection();
		connection.setDoOutput(true); // Triggers POST.
		connection.setRequestProperty("Accept-Charset", charset);
		connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded;charset=" + charset);

		try (OutputStream output = connection.getOutputStream()) {
		    output.write(query.getBytes(charset));
		}

		InputStream response = connection.getInputStream();
	}

}
