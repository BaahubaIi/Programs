package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dao.Accounts;
import dto.User;

public class UserDao {
	

	 	private static String jdbcURL;
	    private static String jdbcUsername;
	    private static String jdbcPassword;
	    private static Connection jdbcConnection;
	     
	    public UserDao(String jdbcURL, String jdbcUsername, String jdbcPassword) {
	        this.jdbcURL = jdbcURL;
	        this.jdbcUsername = jdbcUsername;
	        this.jdbcPassword = jdbcPassword;
	    }
	     
	    public static void connect() throws SQLException {
	        if (jdbcConnection == null || jdbcConnection.isClosed()) {
	            try {
	                Class.forName("com.mysql.jdbc.Driver");
	            } catch (ClassNotFoundException e) {
	                throw new SQLException(e);
	            }
	            jdbcConnection = DriverManager.getConnection(
	                                        jdbcURL, jdbcUsername, jdbcPassword);
	        }
	    }
	     
	    public void disconnect() throws SQLException {
	        if (jdbcConnection != null && !jdbcConnection.isClosed()) {
	            jdbcConnection.close();
	        }
	    }
	    public static void createCustomer(Accounts accounts,User users) throws SQLException {
	    	connect();
	    	String sql1 = "insert into users values(?,?)";
	    	String sql2 = "insert into Accounts values (?,?,?,?)";
	    	PreparedStatement pst1 = jdbcConnection.prepareStatement(sql1);
	    	PreparedStatement pst2 = jdbcConnection.prepareStatement(sql2);
	    	pst1.setString(1, users.getUname());
	    	pst1.setString(2, users.getPwd());
	    	pst1.executeUpdate();
	    	pst2.setString(1, accounts.getAccountNumber());
	    	pst2.setString(2, accounts.getAccountType());
	    	pst2.setString(3, accounts.getCustomername());
	    	pst2.setFloat(4, accounts.getBalnace());
	    	pst2.executeUpdate();
	    	
	    	
	    }
	     
	    public int checkUser(User users) throws SQLException {
	          String sql = "SELECT * FROM users";
	          int flag=0;
	         connect();
	         Statement statement = jdbcConnection.createStatement();
	         ResultSet resultSet = statement.executeQuery(sql);
	         while(resultSet.next()){
	        	 String temp1 = resultSet.getString("uname");
	        	 String temp2 = resultSet.getString("pwd");
	        	 if(temp1.equals(users.getUname() ) &&
	        			 temp2.equals(users.getPwd())){
	        		 flag=1;
	        		 break;
	        	 }
	        	 
	         }
	         
	         resultSet.close();
	         statement.close();
	              	 	
	    	return flag;
	    	
	    }
	}