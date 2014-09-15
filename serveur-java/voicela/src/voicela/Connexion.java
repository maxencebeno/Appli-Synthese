package voicela;

import java.sql.*;
import oracle.jdbc.pool.OracleDataSource;
import java.io.FileInputStream;
import java.util.*;

public class Connexion 
{
   public Connexion() {
   }
   public Connection Connecter() throws Exception
   {
       Properties props = new Properties();
       FileInputStream fichier = new FileInputStream("connexion.properties");
       props.load(fichier);
       OracleDataSource ods = new OracleDataSource();
       ods.setDriverType(props.getProperty("pilote"));
       ods.setPortNumber(new Integer(props.getProperty("port")).intValue());
       ods.setServiceName(props.getProperty("service"));
       ods.setUser(props.getProperty("user"));
       ods.setPassword(props.getProperty("pwd"));
       ods.setServerName(props.getProperty("serveur"));
       return(ods.getConnection());
   }
}