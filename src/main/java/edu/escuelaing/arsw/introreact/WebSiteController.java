package edu.escuelaing.arsw.introreact;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebSiteController {

    public static List<String> movementsList = new ArrayList<>();

    private HttpServletRequest request;

    @GetMapping("/circulos")
    public List<String> circulos() {
        System.out.println(movementsList);
        
        return movementsList;
    }

    @PostMapping("/add-circulos")
    @ResponseBody
    public void positions(@RequestParam(value = "lista") String data) {
        JSONObject myjson = new JSONObject(data);
        JSONArray the_json_array = myjson.getJSONArray("circulos");
        for (int i = 0; i < the_json_array.length(); i++) {
            if (!movementsList.contains(the_json_array.get(i).toString())) {
                movementsList.add(the_json_array.get(i).toString());
            }
        }

    }

    @PostMapping("/reiniciar")
    @ResponseBody
    public void reinicar() {
        movementsList.clear();
    }

}
