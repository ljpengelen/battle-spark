package nl.kabisa.battle.spark.user;

public class User
{
    public User( String _id, String _password, String _email )
    {
        this.id = _id;
        this.password = _password;
        this.email = _email;
    }

    public final String id;
    public final String password;
    public final String email;

    @Override
    public String toString()
    {
        return "{ \"id\": \"" + this.id + "\", \"email\":\"" + this.email + "\" }";
    }
}
