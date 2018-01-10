import java.sql.*;
class M2 
{
	public static void main(String[] args) 
		throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","1234");
		Statement stmt = con.createStatement();
		String s1 ="INSERT INTO TAB208 VALUES(1, 'RAMU')";
		stmt.execute(s1);
		System.out.println("done");
	}
}
