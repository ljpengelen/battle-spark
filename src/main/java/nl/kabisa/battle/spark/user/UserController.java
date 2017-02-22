package nl.kabisa.battle.spark.user;

import static spark.Spark.path;
import static spark.Spark.get;
//import static spark.Spark.before;
//import static spark.Spark.post;
//import static spark.Spark.put;

public class UserController
{
    public UserController( final UserService _userService )
    {
        path("/user", () -> {
            get("/list", (req, res) -> _userService.getAllUsers());
            //post("/add", () -> _userService.createUser() );
        });
    }

}
