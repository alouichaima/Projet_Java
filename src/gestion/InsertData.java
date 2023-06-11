package gestion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class InsertData {
	 public static void main(String args[])
	  {
	    try
	    {
	      //étape 1: charger la classe driver
	      Class.forName("com.mysql.jdbc.Driver");
	      //étape 2: créer l'objet de connexion
	      Connection conn = DriverManager.getConnection(
	    		  "jdbc:mysql://localhost:3306/gestion","root","");
	      //étape 3: créer l'objet statement 
	      Statement stmt = conn.createStatement();
	      //étape 4: exécuter la requête
	      System.out.println("Insertion...");
	    
	     String sql = "INSERT INTO employée " +
	                   "VALUES (1, 'Aloui', 'chaima', 'femme', 35, '01/01/1989', 'Informatique', 'Ariana', 'aloui.@gmail.com', '20132547')";
	      
	      String sql1 = "INSERT INTO employée " +
                  "VALUES (2, 'guedri', 'oumaima', 'femme', 35, '01/01/1989', 'Informatique', 'Ariana', 'guedri.@gmail.com', '20132547')";
	      
	      String sql2 = "INSERT INTO employée " +
                  "VALUES (3, 'sahar', 'kadri', 'femme', 35, '01/01/1989', 'Informatique', 'Ariana', 'kadri.@gmail.com', '20132547')";
	      String sql3 = "INSERT INTO employée " +
                  "VALUES (4, 'baklouti', 'nour', 'femme', 35, '01/01/1989', 'Informatique', 'Ariana', 'aloui.@gmail.com', '20132547')";

	     stmt.executeUpdate(sql);
	     stmt.executeUpdate(sql1);
	     stmt.executeUpdate(sql2);
	     stmt.executeUpdate(sql3);
	    
	      System.out.println("Données insérés dans la table...");
	      //étape 5: fermez l'objet de connexion
	      conn.close();
	      
		  ResultSet rs=stmt.executeQuery("select * from employée"); 
			   

			   while(rs.next())  
			    System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)
			    +" "+rs.getString(6)+" "+rs.getString(7)+" "+rs.getString(8)+" "+rs.getString(9)+" "+rs.getString(10));

			     System.out.println("---------------------------------------------");
				   conn.close();  
	    }
	    catch(Exception e){ 
	      System.out.println(e);
	    }
	  }

}
