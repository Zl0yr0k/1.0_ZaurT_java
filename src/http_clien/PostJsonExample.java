package http_clien;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class PostJsonExample {
    static void main(String[] args) throws Exception {
        HttpClient client = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_2)
                .connectTimeout(Duration.ofSeconds(10))
                .build();
        String json = """
          {
            "title": "foo",
            "body": "bar",
            "userId": 1
          }
        """;
        HttpRequest req = HttpRequest.newBuilder()
                .uri(URI.create("https://jsonplaceholder.typicode.com/posts"))
                .timeout(Duration.ofSeconds(5))
                .header("Accept", "application/json")
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(json))
                .build();
        HttpResponse<String> resp = client.send(req, HttpResponse.BodyHandlers.ofString());
        int code = resp.statusCode();
        if (code >= 200 && code < 300) {
            System.out.println("Created, Location: " + resp.headers().firstValue("Location").orElse("<none>"));
            System.out.println("Response:\n" + resp.body());
        } else {
            System.err.println("Failed with HTTP " + code + ":\n" + resp.body());
        }
    }
}





