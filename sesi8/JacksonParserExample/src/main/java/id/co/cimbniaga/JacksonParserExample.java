package id.co.cimbniaga;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.net.URL;

public class JacksonParserExample {
    public static void main(String[] args) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            URL url = new URL("https://jsonplaceholder.typicode.com/users");
            User[] users = mapper.readValue(url, User[].class);
//            List<User> users = Arrays.asList(mapper.readValue(url, User[].class));

            for (User user : users) {
                System.out.println("ID: " + user.getId());
                System.out.println("Name: " + user.getName());
                System.out.println("Username: " + user.getUsername());
                System.out.println("Email: " + user.getEmail());
                System.out.println("-------------------------");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
