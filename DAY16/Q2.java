package DAY16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//2. Display publishers who published books by author who wrote more than 2 titles.
public class Q2 {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String sql="select pub_name	from   titles t  join titleauthor ta on(t.title_id=ta.title_id) join authors a on(ta.au_id=a.au_id) left join publishers p on(t.pub_id=p.pub_id) group by pub_name  HAVING count(title)>2";
		Connection con=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;database = pubs;user=sa;password=<YourStrong@Passw0rd>;database= pubs;encrypt=true;trustServerCertificate=true");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(sql);
		
		while(rs.next()) {
			System.out.println("!!!!!!"+rs.getString(1)+"!!!!");
		}
		rs.close();
		con.close();
		st.close();
	}

}
