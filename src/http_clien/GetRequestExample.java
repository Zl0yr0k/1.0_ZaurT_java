package http_clien;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class GetRequestExample {
    static void main() throws IOException, InterruptedException {
        HttpClient client = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_2)
                .connectTimeout(Duration.ofSeconds(10))
                .build();

        String uriString = "https://jsonplaceholder.typicode.com/posts/1";
        URI uri = URI.create(uriString);

        HttpRequest request = HttpRequest.newBuilder(uri)
                .GET()
                .timeout(Duration.ofSeconds(12))
                .header("Accept", "application/json")
                .header("User-Agent", "JavaHttpClient/1.0")
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        int statusCode = response.statusCode();

        if (statusCode >= 200 && statusCode < 300){
            System.out.println("Запрос успешен: " + statusCode);
        } else{
            System.err.println("Ошибка HTTP: код " + statusCode);
            System.err.println("Тело ответа: " + response.body());
        }

        String body = response.body();
        System.out.println("Тело ответа JSON:\n" + body);

        String title = extractValue(body, "\"title\":");
        String postBody = extractValue(body, "\"body\":");
        System.out.println("Заголовок: " + title);
        System.out.println("Содержимое: " + postBody);
    }

    //метод извлечения данных их json файла
    private static String extractValue(String json, String key) {
        int idx = json.indexOf(key);
        if (idx < 0) return "";
        int start = json.indexOf("\"", idx + key.length()) + 1;
        int end = json.indexOf("\"", start);
        return json.substring(start, end);
    }
}
