package data;
import java.sql.*;
import java.util.ArrayList;

import entidades.Personaje;

public class DBInteract {
	public static int guardarpers(entidades.Personaje pers){
		//terminada consulta
		int id = 0;
		

		try {
		    Class.forName("com.mysql.jdbc.Driver");;
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/trabajojava?autoReconnect=true&useSSL=false","root","password"); 
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
		 id=res.getInt(1);}
		 
		 
		} 
		catch (SQLException e) {
			id=0;
			 System.out.println("SQLException");
		}
		catch (ClassNotFoundException e) {System.out.println("CLASSException");id=0;};
		return id;}
	public static boolean controlNombre(String nombre){
		int count;
		try {
		    Class.forName("com.mysql.jdbc.Driver");;
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/trabajojava?autoReconnect=true&useSSL=false","root","password"); 
			Statement st;
		 st= connection.createStatement();
		 ResultSet res = st.executeQuery("select count(*) from personajes WHERE nombre="+nombre+" ;");
		 if (res.next()){
		 count=res.getInt(1);
		 return count==0;}
		 
		 
		} 
		catch (SQLException e) {
			count=1;
			 System.out.println("SQLException");
		}
		catch (ClassNotFoundException e) {System.out.println("CLASSException");};
		    count=1; 
		
		return true;};
	public static Personaje[] buscaTodos()
	{	Personaje[] per=null;
	ResultSet res=null;
		try {
		    Class.forName("com.mysql.jdbc.Driver");;
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/trabajojava?useSSL=false","root","password"); 
			Statement st;
			Statement nu=connection.createStatement();
		 st= connection.createStatement();
		 res = st.executeQuery("SELECT idpersonaje, nombre, atk, def, ene, eva, hp FROM trabajojava.personajes;");
		 ResultSet numero = nu.executeQuery("SELECT count(*) from trabajojava.personajes;");
		 numero.next();
		 int num = numero.getInt(1);
		 per = new Personaje[num];
		 int i=0;
		while (res.next()){
			Personaje p= new Personaje(res.getInt("idpersonaje"), res.getInt("hp"),res.getInt("def"), res.getInt("eva"), res.getInt("atk"), res.getInt("ene"), res.getString("nombre"));
			per[i]=p;
			i++;
			System.out.println(p);
		};
		res.close();
		numero.close();
		 	} 
		catch (SQLException e) {
			;
			 System.out.println("SQLException \t"+ e.getMessage());
		}
		catch (ClassNotFoundException e) {System.out.println("CLASSException");}; 
		return per;
	};

}


