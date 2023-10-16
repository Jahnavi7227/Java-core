package DAY16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//4. Update the price of the book BU1111 with the Price of book MC2222.
public class Q4 {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String sql="UPDATE titles	set price=(Select price from titles where title_id='MC2222')	where  title_id='BU1111'";
		Connection con=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;database = pubs;user=sa;password=<YourStrong@Passw0rd>;database= pubs;encrypt=true;trustServerCertificate=true");
		Statement st=con.createStatement();
		int rs=st.executeUpdate(sql);
		System.out.println("NO_OF ROWS AFFECTED "+rs);
		ResultSet rs2=st.executeQuery("select * from titles");
		while(rs2.next()) {
			System.out.println("!!!!!!"+rs2.getString(2)+"!!!!"+rs2.getInt(5));
		}
	}

}
