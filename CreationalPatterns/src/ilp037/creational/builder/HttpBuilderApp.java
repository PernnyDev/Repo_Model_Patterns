package ilp037.creational.builder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpClient.Version;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class HttpBuilderApp {

	public static void main(String[] args) throws Exception {
		HttpRequest req = HttpRequest.newBuilder()
			.uri(new URI("https://viacep.com.br/ws/04678000/json"))
			.version(Version.HTTP_2)
			.GET()
			.build();
		
		HttpResponse<String> response = HttpClient.newBuilder()
			.followRedirects(HttpClient.Redirect.ALWAYS)
			.build()
			.send(req, BodyHandlers.ofString());
		
		System.out.println(response.body());
	}

}
