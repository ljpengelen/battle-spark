package nl.kabisa.battle.spark;

import static spark.Spark.get;

import nl.kabisa.battle.spark.user.UserController;
import nl.kabisa.battle.spark.user.UserService;

public class Application
{
    public static void main(String[] args)
    {
        // From the article: https://dzone.com/articles/building-simple-restful-api
        new UserController( new UserService() );

        get("/", (req, res) -> "Hello World");
    }
}