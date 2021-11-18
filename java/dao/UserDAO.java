package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import model.User;

public class UserDAO {
	
    private Connector conn = new Connector();
    
    private static final String INSERT_MEMBER_SQL = "INSERT INTO member" 
    			+ "  (username, email, password, CreatedDate) VALUES " 
    			+ " (?, ?, ?, current_timestamp);";

    private static final String SELECT_MEMBER = "select username, email, password from member "
    		+ "where username=? or email=? and password=?";
    private static final String UPDATE_USERS_SQL = "update member set firstname=?, lastname=?, username=?, password=?, phone=?, email=?, decription=?, UpdatedDate=?;";
    
    
    public UserDAO() {}
    
    public boolean insertUser(User user) throws SQLException {
    	boolean rowInserted;
    	
        // try-with-resource statement will auto close the connection.
        try (Connection connection = conn.getConnection(); 
        		PreparedStatement preparedStatement = connection.prepareStatement(INSERT_MEMBER_SQL)) {
            preparedStatement.setString(1, user.getUsername());
            preparedStatement.setString(2, user.getEmail());
            preparedStatement.setString(3, user.getPassword());
            
            rowInserted = (preparedStatement.executeUpdate() > 0);
        }
        return rowInserted;
    }
    
    public boolean selectUser(User user) {
    	boolean flag = false;
		// Step 1: Establishing a Connection
		try (Connection connection = conn.getConnection();
				// Step 2:Create a statement using connection object
				PreparedStatement preparedStatement = connection.prepareStatement(SELECT_MEMBER);) {
			preparedStatement.setString(1, user.getUsername());
			preparedStatement.setString(2, user.getEmail());
			preparedStatement.setString(3, user.getPassword());
			
			// Step 3: Execute the query or update query
			flag = preparedStatement.executeQuery().first();

			// Step 4: Process the ResultSet object.
			/*
			 * while (rs.next()) { String name = rs.getString("username"); String email =
			 * rs.getString("email"); String password = rs.getString("password"); user = new
			 * User(name, email, password); }
			 */
		} catch (SQLException e) {
			printSQLException(e);
		}
		return flag;
    }
    
    public boolean updateUser(User user) throws SQLException {
        boolean rowUpdated;
        String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
        //firstname=?, lastname=?, username=?, password=?, phone=?, email=?, description=?, UpdatedDate=?;";
        
        try (Connection connection = conn.getConnection(); 
        		PreparedStatement statement = connection.prepareStatement(UPDATE_USERS_SQL);) {
            statement.setString(1, user.getFirstname());
            statement.setString(2, user.getLastname());
            statement.setString(3, user.getUsername());
            statement.setString(4, user.getPassword());
            statement.setString(5, user.getPhone());
            statement.setString(6, user.getEmail());
            statement.setString(7, user.getDescription());
            statement.setString(8, timeStamp);
            
            rowUpdated = statement.executeUpdate() > 0;
        }
        return rowUpdated;
    }
    private void printSQLException(SQLException ex) {
        for (Throwable e: ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }
}
