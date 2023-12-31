import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class App {
    public static void main(String[] args) throws Exception {
       HttpClient client = HttpClient.newHttpClient();

       HttpRequest request = HttpRequest.newBuilder()
       .uri(URI.create("http://viacep.com.br/ws/53580310/json/"))
       .build();

        /*client.sendAsync(request, BodyHandlers.ofString())
         .thenApply(HttpResponse::body)
         .thenAccept(System.out::println)
         .join();*/

         HttpResponse<String> response = client.send(request,BodyHandlers.ofString());

         System.out.println(response.body());

       
    }
}
