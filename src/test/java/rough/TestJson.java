package rough;

import utils.JSONReader;

import java.io.IOException;

public class TestJson {

    public static void main(String[] args) throws IOException {
        JSONReader jsonReader = new JSONReader(System.getProperty("user.dir") + "/src/main/resources/locators/OR.json");
        System.out.println(jsonReader.getLocator("locators.homepage.username.css"));
    }
}
