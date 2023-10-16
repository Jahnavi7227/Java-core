package DAY16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//3. Delete rows from title author for author with first_name as dean.
public class Q3 {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String sql="DELETE FROM titleauthor	WHERE au_id IN (SELECT au_id FROM authors WHERE au_fname = 'Burt')";
		Connection con=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;database = pubs;user=sa;password=<YourStrong@Passw0rd>;database= pubs;encrypt=true;trustServerCertificate=true");
		Statement st=con.createStatement();
		//ResultSet rs=st.executeQuery(sql);
		System.out.println(st.execute(sql));
	}

}
