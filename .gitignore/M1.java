import java.sql.*;
class M1 
{
	public static void main(String[] args) 
		throws Exception
	{
		//1.registering a driver
		Class.forName("oracle.jdbc.driver.OracleDriver");

		//2.establishing a db connection
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "1234");
		
		//3.creating Statement to send the sql command
		Statement stmt = con.createStatement();

		//4.composing sql command
		String sql = "CREATE TABLE TAB208(ID NUMBER, FIRST_NAME VARCHAR2(9))";

		//5.send sql command to the db
		stmt.execute(sql);

		//6.closing all db resources
		stmt.close();
		con.close();

		System.out.println("done");

	}
}
