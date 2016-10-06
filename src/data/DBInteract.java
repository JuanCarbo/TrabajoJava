package data;
import java.sql.*;

public class DBInteract {
	public static int guardarpers(entidades.Personaje pers){
		//terminada consulta
		int id = 0;
		

		try {
		    Class.forName("com.mysql.jdbc.Driver");;
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/trabajojava?autoReconnect=true&useSSL=false","root","asc354d6"); 
			PreparedStatement prep = connection.prepareStatement("INSERT INTO `trabajojava`.`personajes` (`nombre`, `atk`, `def`, `ene`, `eva`, `hp`) VALUES (?, ?, ?, ?, ?, ?)");
		 prep.setString(1, pers.getNombre());
		 prep.setInt(2, pers.getAtk());
		 prep.setInt(3, pers.getDef());
		 prep.setInt(4, pers.getEne());
		 prep.setInt(5, pers.getEva());
		 prep.setInt(6, pers.getHp());
		 prep.executeUpdate();
		 Statement st;
		 st= connection.createStatement();
		 ResultSet res = st.executeQuery("select MAX(idpersonaje) from personajes ;");
		 if (res.next()){
		 id=res.getInt(1);
		 System.out.println(String.valueOf(id));}
		 
		 
		} 
		catch (SQLException e) {
			id=0;
			 System.out.println("SQLException");
		}
		catch (ClassNotFoundException e) {System.out.println("CLASSException");id=0;};
		return id;}
	public static void main(String[] args) {
		int id;
		

		try {
		    Class.forName("com.mysql.jdbc.Driver");;
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/trabajojava?autoReconnect=true&useSSL=false","root","asc354d6"); 
			Statement st;
		 st= connection.createStatement();
		 ResultSet res = st.executeQuery("select MAX(idpersonaje) from personajes ;");
		 if (res.next()){
		 id=res.getInt(1);
		 System.out.println(String.valueOf(id));}
		 
		 
		} 
		catch (SQLException e) {
			id=0;
			 System.out.println("Exception");
		}
		catch (ClassNotFoundException e) {System.out.println("Exception1");};
		id= 0; }

}
