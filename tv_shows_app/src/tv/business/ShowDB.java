package tv.business;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import tv.util.Console;
import tv.util.DBUtil;

public class ShowDB implements ShowDAO {
	
	private Connection getConnection() throws SQLException {
		String dbUrl = "jdbc:mysql:localhost:3306/tv_shows";
		String userName = "tv_shows_user";
		String password = "sesame";
		try {

			Class.forName("com.mysql.jdbc.Driver").newInstance();

		}

		catch (ClassNotFoundException cnfe) {

			System.out.println(cnfe);

		} catch (InstantiationException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		} catch (IllegalAccessException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();
			

		}

		Connection connection = DriverManager.getConnection(dbUrl, userName, password);

		return connection;
	}
	

	@Override

	public List<Show> getAll() {

		String sql = "SELECT * FROM tvshow";

		List<Show> shows = new ArrayList<>();

		try (Connection connection = DBUtil.getConnection();

			 PreparedStatement ps = connection.prepareStatement(sql);

			 ResultSet rs = ps.executeQuery()) {

			while (rs.next()) {

				int id = rs.getInt(1);

				String name = rs.getString(2);

				String rating = rs.getString(3);

				int length = rs.getInt(4);

				String genre = rs.getString(5);

				String network = rs.getString(6);

				Show s = new Show(id, name, rating, length, genre,

								network);

				shows.add(s);

			}	

		} catch (SQLException e) {

			e.printStackTrace();

		}

		return shows;

	}


	@Override
	public List<Show> get(int length) {
		String sql = "SELECT* FROM TvShow WHERE length = ?";
		List <Show> shows = new ArrayList<>();
		try (Connection connection = DBUtil.getConnection();
				PreparedStatement ps = connection.prepareStatement(sql)) {
			ps.setInt(1, length);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				int id = rs.getInt(1);

				String name = rs.getString(2);

				String rating = rs.getString(3);

				int l = rs.getInt(4);

				String genre = rs.getString(5);

				String network = rs.getString(6);

				Show s = new Show(id, name, rating, l, genre,

								network);
				shows.add(s);
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return shows;
	}
	@Override
	public List<Show> get(String genre) {
		String sql = "SELECT* FROM TvShow WHERE genre = ?";
		List <Show> shows = new ArrayList<>();
		try (Connection connection = DBUtil.getConnection();
				PreparedStatement ps = connection.prepareStatement(sql)) {
			ps.setString(1, genre);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				int id = rs.getInt(1);

				String name = rs.getString(2);

				String rating = rs.getString(3);

				int length = rs.getInt(4);

				String g = rs.getString(5);

				String network = rs.getString(6);

				Show s = new Show(id, name, rating, length, g,

								network);
				shows.add(s);
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return shows;
		
		
	
	}


	// not implemented yet
	public static boolean add(String name, String rating, int length, String genre, String network) {
		String sql = "INSERT INTO tvshow (Name, Rating, Length, Genre, Network)"  
				+" VALUES (?, ?, ?, ?, ?)";
		try (Connection connection = DBUtil.getConnection();
				PreparedStatement ps = connection.prepareStatement(sql)) {
			ps.setString(1, name);
			ps.setString(2, rating);
			ps.setInt(3, length);
			ps.setString(4, genre);
			ps.setString(5, network);
			
			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
	}

	// not implemented yet
	public boolean update(Show s) {
		// TODO Auto-generated method stub
		return false;
	}

	// not implemented yet
	public boolean delete(Show s) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean add(Show s) {
		// TODO Auto-generated method stub
		return false;
	}

}
