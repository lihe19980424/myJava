package jdbc;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class JDBCDemo {
	
	public static void main(String[] args) {
		Connection connection=null;
		PreparedStatement prepareStatement=null;
		ResultSet resultSet =null;
		try {
			//1.加载驱动
			Class.forName("com.mysql.jdbc.Driver");
			//2.建立连接
			connection=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/mycompany?","root","215215");
			//System.out.println(connection);
			//3.声明SQL语句
			String str ="select * from employees";
			//4.编译SQL语句
			prepareStatement = (PreparedStatement) connection.prepareStatement(str);
			//5.执行SQL语句
			resultSet =prepareStatement.executeQuery();
			//6.取出结果集
			while(resultSet.next()){
				//拿到一条记录
				int employee_id=resultSet.getInt("employee_id");
				String first_name=resultSet.getString("first_name");
				System.out.print(employee_id);
				System.out.print(first_name);
				System.out.println();
			}	
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				resultSet.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				prepareStatement.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
		
	}
	
}
