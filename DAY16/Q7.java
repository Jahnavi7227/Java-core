package DAY16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//7. Create a view to display publisher name, city, and no of books published.
public class Q7 {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String sql="create view newtablee3(publishername,pub_city,no_of_books) AS	select pub_name,city,count(title)		from publishers p right join  titles t on(t.pub_id=p.pub_id) 	group by pub_name,city";
		Connection con=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;database = pubs;user=sa;password=<YourStrong@Passw0rd>;database= pubs;encrypt=true;trustServerCertificate=true");
		Statement st=con.createStatement();
		int rs=st.executeUpdate(sql);
		//System.out.println("No of rows affected are"+rs);
		String sql1="select * from newtablee3";
		ResultSet rs2=st.executeQuery(sql1);
		while(rs2.next()) {
			System.out.println(rs2.getString(1)+" !!!!! "+rs2.getString(2)+"!!!!!!!"+rs2.getInt(3)+"!!!!!!");
		}
		rs2.close();
		con.close();
		st.close();
		
	}

}
