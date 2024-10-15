import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Request {
    public static api request(String url) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        Gson gson  = new Gson();
        return gson.fromJson(response.body(), api.class);
    }
    public static void conversor(String div1, String div2, double amount) throws IOException, InterruptedException {
        String url = "https://v6.exchangerate-api.com/v6/b772d9bf7bab1a3f243c1904/pair/"+div1+"/"+div2+"/"+amount;
        api objeto = request(url);
        System.out.println("");
        System.out.println("El tipo de cambio de "+ div1 + " a "+ div2 + " es: "+ objeto.cambio);
        System.out.println("");
        System.out.println("El valor de la conversion es: $" + objeto.conversion);
        System.out.println("");
    }
}
