package voicela;

import java.sql.*;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.*;

public class Connexion 
{
    public String Connecter() throws Exception
    {
        String result="";
        Properties properties = new Properties();

        try
        {
            InputStream file = getClass().getClassLoader().getResourceAsStream("config.properties");
            properties.load(file);

            String DataBaseHost = properties.getProperty("serveur");
            String user = properties.getProperty("user");
            String password = properties.getProperty("pwd");
            String dataBaseName = properties.getProperty("user");

            result="jdbc:mysql://" + DataBaseHost +"/" + dataBaseName +"?user=" + user +"&password=" + password;
        }
        catch(Exception e)
        {
            throw new Exception("Erreur dans la classe DBConnexion.getURLConnexion\nType de l'exception : " + e.toString());
        }
        return result;
    }
}
