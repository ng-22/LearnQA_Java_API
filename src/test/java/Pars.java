import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class Pars {

    @Test
    public void Pars() {

        JsonPath response = RestAssured
                .get("https://playground.learnqa.ru/api/get_json_homework")
                .jsonPath();

        String answer = response.get("answer");
        if (answer == null){
            System.out.println("The key 'answer' is absent");
        } else {
            System.out.println(answer);
        }
    }

}