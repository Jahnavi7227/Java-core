package DAY16;
// create a view to contain title, publisher, year of publishing, price and type. Make sure when price is null display dero and type is null display Zero.

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Q1 {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String sql="create view  newtablee1(title,publisher,year_of_publishing,price_of_title,type_of_book) as select title,pub_name,year(pubdate),ISNULL(price,0),type  from titles t join publishers p on(p.pub_id=t.pub_id)  ";
		Connection con=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;database = pubs;user=sa;password=<YourStrong@Passw0rd>;database= pubs;encrypt=true;trustServerCertificate=true");
		Statement st=con.createStatement();
		int rs=st.executeUpdate(sql);
		System.out.println("No of rows affected are"+rs);
		String sql1="select * from newtablee1";
		ResultSet rs2=st.executeQuery(sql1);
		while(rs2.next()) {
			System.out.println(rs2.getString(1)+" !!!!! "+rs2.getString(2)+"!!!!!!!"+rs2.getInt(3)+"!!!!!!"+rs2.getInt(4)+"!!!!!!!"+rs2.getString(5));
		}
		rs2.close();
		con.close();
		st.close();
	}

}
