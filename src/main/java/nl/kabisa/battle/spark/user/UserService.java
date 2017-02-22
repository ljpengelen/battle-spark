package nl.kabisa.battle.spark.user;

import java.util.Collection;
import java.util.HashMap;

public class UserService
{
    private HashMap<String, User> users;

    public UserService()
    {
        users = new HashMap<String, User>();

        // For testing
        createUser( "test", "user", "test@kabisa.nl" );
    }
    
    public Collection<User> getAllUsers()
    {
        return users.values();
    }

    // returns a single user by id
    public User getUser( String _id )
    {
        return (User) users.get( _id );
    }

    // creates a new user
    public User createUser(String _id, String _password, String _email )
    {
        // TODO: error handling?
        if ( users.containsKey( _id ) )
            return null;
        if ( _id == null || _id.length() < 1 )
            return null;

        User user = new User( _id, _password, _email );

        users.put( _id, user );
        return user;
     }
}
