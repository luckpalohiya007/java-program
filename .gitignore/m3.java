import java.sql.*;
class M3
{
	public static void main(String[] args) 
		throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","1234");
		Statement stmt = con.createStatement();
		String s1 ="INSERT INTO TAB208 VALUES(2, 'KIRAN')";
		String s2 ="INSERT INTO TAB208 VALUES(3, 'BABU')";
		String s3 ="INSERT INTO TAB208 VALUES(4, 'MURALI')";
		String s4 ="INSERT INTO TAB208 VALUES(5, 'VINOD')";
		stmt.execute(s1);
		stmt.execute(s2);
		stmt.execute(s3);
		stmt.execute(s4);
		System.out.println("done");
	}
}
