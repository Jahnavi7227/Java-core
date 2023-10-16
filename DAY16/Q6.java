package DAY16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//6. Display titles published by any publisher who published a title in 2021.
public class Q6 {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection con=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;database = pubs;user=sa;password=<YourStrong@Passw0rd>;database= pubs;encrypt=true;trustServerCertificate=true");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select title from titles where year(pubdate)=2021");
		
		while(rs.next()) {
			System.out.println("!!!!!!"+rs.getString(1)+"!!!!");
		}
		rs.close();
		con.close();
		st.close();

	}

}
