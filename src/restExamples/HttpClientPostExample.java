package restExamples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;

public class HttpClientPostExample {
	public static void main(String[] args) throws ClientProtocolException, IOException {
		HttpClient client = new DefaultHttpClient();
		HttpPost request = new HttpPost("http://www.sunmetrix.com");
		StringEntity input = new StringEntity("{\'name1\':\'Jatin\',\'name2\':\'Kashyap\'}");
		input.setContentType("application/json");
		request.setEntity(input);
		HttpResponse response = client.execute(request);
		BufferedReader br = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
		String line = "";
		while((line = br.readLine())==null){
			System.out.println(line);
		}
	}
}
