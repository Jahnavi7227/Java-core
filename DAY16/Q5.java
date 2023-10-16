package DAY16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//5. Display titles published in last 25 years.
public class Q5 {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String sql="select title,year(pubdate) as year	from titles	where YEAR(pubdate)>DATEPART(yy,GETDATE())-25";
		Connection con=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;database = pubs;user=sa;password=<YourStrong@Passw0rd>;database= pubs;encrypt=true;trustServerCertificate=true");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(sql);
		
		while(rs.next()) {
			System.out.println("!!!!!!"+rs.getString(1)+"!!!!"+rs.getInt(2));
		}
		rs.close();
		con.close();
		st.close();

	}

}
