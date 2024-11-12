package jonhson.project.maeven;


import com.google.gson.Gson;

import jonhson.project.maeven.model.User;
import jonhson.project.maeven.model.UserDatabase;
import static spark.Spark.get;
import static spark.Spark.post;

public class App {
    public static void main(String[] args) {
    	UserDatabase db = new UserDatabase();
        Gson gson = new Gson();

        post("/addUser", (req, res) -> {
            User user = gson.fromJson(req.body(), User.class);
            res.status(201);
            return "Utilisateur ajouté!";
        });

        
    }
}