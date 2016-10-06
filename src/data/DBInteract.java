package data;
import java.sql.*;

public class DBInteract {
	public static int guardarpers(entidades.Personaje pers){
		int id;
		String url = "localhost:3306";
		String username = "root";
		String password = "asc354d6";
		
		

		try (
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/trabajojava","root","asc354d6")) { 
			PreparedStatement prep = connection.prepareStatement("INSERT INTO `trabajojava`.`personajes` " + "(`nombre`, `atk`, `def`, `ene`, `eva`, `hp`) VALUES (?, ?, ?, ?, ?, ?)");
		 prep.setString(1, pers.getNombre());
		 prep.setInt(2, pers.getAtk());
		 prep.setInt(3, pers.getDef());
		 prep.setInt(4, pers.getEne());
		 prep.setInt(5, pers.getEva());
		 prep.setInt(6, pers.getHp());
		 prep.executeUpdate();
		 ResultSet res = prep.executeQuery("select LAST_INSERT_ID();");
		 id=res.getInt(1);
		 
		 
		} catch (SQLException e) {id=0;
		};
		id= 0; 
		return id;}

}
